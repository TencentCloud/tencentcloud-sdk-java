/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecTendencyEventInfo extends AbstractModel{

    /**
    * 趋势列表
    */
    @SerializedName("EventSet")
    @Expose
    private RunTimeTendencyInfo [] EventSet;

    /**
    * 事件类型：
ET_ESCAPE : 容器逃逸
ET_REVERSE_SHELL: 反弹shell
ET_RISK_SYSCALL:高危系统调用
ET_ABNORMAL_PROCESS: 异常进程
ET_ACCESS_CONTROL 文件篡改
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
     * Get 趋势列表 
     * @return EventSet 趋势列表
     */
    public RunTimeTendencyInfo [] getEventSet() {
        return this.EventSet;
    }

    /**
     * Set 趋势列表
     * @param EventSet 趋势列表
     */
    public void setEventSet(RunTimeTendencyInfo [] EventSet) {
        this.EventSet = EventSet;
    }

    /**
     * Get 事件类型：
ET_ESCAPE : 容器逃逸
ET_REVERSE_SHELL: 反弹shell
ET_RISK_SYSCALL:高危系统调用
ET_ABNORMAL_PROCESS: 异常进程
ET_ACCESS_CONTROL 文件篡改 
     * @return EventType 事件类型：
ET_ESCAPE : 容器逃逸
ET_REVERSE_SHELL: 反弹shell
ET_RISK_SYSCALL:高危系统调用
ET_ABNORMAL_PROCESS: 异常进程
ET_ACCESS_CONTROL 文件篡改
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型：
ET_ESCAPE : 容器逃逸
ET_REVERSE_SHELL: 反弹shell
ET_RISK_SYSCALL:高危系统调用
ET_ABNORMAL_PROCESS: 异常进程
ET_ACCESS_CONTROL 文件篡改
     * @param EventType 事件类型：
ET_ESCAPE : 容器逃逸
ET_REVERSE_SHELL: 反弹shell
ET_RISK_SYSCALL:高危系统调用
ET_ABNORMAL_PROCESS: 异常进程
ET_ACCESS_CONTROL 文件篡改
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    public SecTendencyEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecTendencyEventInfo(SecTendencyEventInfo source) {
        if (source.EventSet != null) {
            this.EventSet = new RunTimeTendencyInfo[source.EventSet.length];
            for (int i = 0; i < source.EventSet.length; i++) {
                this.EventSet[i] = new RunTimeTendencyInfo(source.EventSet[i]);
            }
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EventSet.", this.EventSet);
        this.setParamSimple(map, prefix + "EventType", this.EventType);

    }
}

