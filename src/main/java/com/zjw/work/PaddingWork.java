package com.zjw.work;

import com.zjw.domain.ConvertWrap;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Queue;

/**
 * @author 朱俊伟
 * @date 2023/03/19 0:05
 */
@Data
@AllArgsConstructor
public class PaddingWork {

    private Queue<ConvertWrap> convetorQueue;

    public void work(){
//        for (int i = 1; i <= 5; i++) {
            new WorkThread(convetorQueue).start();
//        }
    }
}

class WorkThread extends Thread{

    private final Queue<ConvertWrap> convertWrapQueue;

    public WorkThread(Queue<ConvertWrap> convertWrapQueue) {
        this.convertWrapQueue = convertWrapQueue;
    }

    @Override
    public void run() {
        while (true){
            synchronized (convertWrapQueue){
                while (convertWrapQueue.isEmpty()){
                    //                        convertWrapQueue.wait();
                    return;
                }
                ConvertWrap convertWrap = convertWrapQueue.poll();
                try {
                    Convertor.convertor(convertWrap);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}