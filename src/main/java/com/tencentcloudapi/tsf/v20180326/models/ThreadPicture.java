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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ThreadPicture extends AbstractModel{

    /**
    * 总线程数
    */
    @SerializedName("ThreadCount")
    @Expose
    private CurvePoint [] ThreadCount;

    /**
    * 活跃线程数
    */
    @SerializedName("ThreadActive")
    @Expose
    private CurvePoint [] ThreadActive;

    /**
    * 守护线程数
    */
    @SerializedName("DeamonThreadCount")
    @Expose
    private CurvePoint [] DeamonThreadCount;

    /**
     * Get 总线程数 
     * @return ThreadCount 总线程数
     */
    public CurvePoint [] getThreadCount() {
        return this.ThreadCount;
    }

    /**
     * Set 总线程数
     * @param ThreadCount 总线程数
     */
    public void setThreadCount(CurvePoint [] ThreadCount) {
        this.ThreadCount = ThreadCount;
    }

    /**
     * Get 活跃线程数 
     * @return ThreadActive 活跃线程数
     */
    public CurvePoint [] getThreadActive() {
        return this.ThreadActive;
    }

    /**
     * Set 活跃线程数
     * @param ThreadActive 活跃线程数
     */
    public void setThreadActive(CurvePoint [] ThreadActive) {
        this.ThreadActive = ThreadActive;
    }

    /**
     * Get 守护线程数 
     * @return DeamonThreadCount 守护线程数
     */
    public CurvePoint [] getDeamonThreadCount() {
        return this.DeamonThreadCount;
    }

    /**
     * Set 守护线程数
     * @param DeamonThreadCount 守护线程数
     */
    public void setDeamonThreadCount(CurvePoint [] DeamonThreadCount) {
        this.DeamonThreadCount = DeamonThreadCount;
    }

    public ThreadPicture() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThreadPicture(ThreadPicture source) {
        if (source.ThreadCount != null) {
            this.ThreadCount = new CurvePoint[source.ThreadCount.length];
            for (int i = 0; i < source.ThreadCount.length; i++) {
                this.ThreadCount[i] = new CurvePoint(source.ThreadCount[i]);
            }
        }
        if (source.ThreadActive != null) {
            this.ThreadActive = new CurvePoint[source.ThreadActive.length];
            for (int i = 0; i < source.ThreadActive.length; i++) {
                this.ThreadActive[i] = new CurvePoint(source.ThreadActive[i]);
            }
        }
        if (source.DeamonThreadCount != null) {
            this.DeamonThreadCount = new CurvePoint[source.DeamonThreadCount.length];
            for (int i = 0; i < source.DeamonThreadCount.length; i++) {
                this.DeamonThreadCount[i] = new CurvePoint(source.DeamonThreadCount[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ThreadCount.", this.ThreadCount);
        this.setParamArrayObj(map, prefix + "ThreadActive.", this.ThreadActive);
        this.setParamArrayObj(map, prefix + "DeamonThreadCount.", this.DeamonThreadCount);

    }
}

