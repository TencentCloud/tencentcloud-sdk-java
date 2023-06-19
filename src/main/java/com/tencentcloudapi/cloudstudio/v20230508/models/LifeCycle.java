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
package com.tencentcloudapi.cloudstudio.v20230508.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifeCycle extends AbstractModel{

    /**
    * 工作空间首次初始化时执行
    */
    @SerializedName("Init")
    @Expose
    private LifeCycleCommand [] Init;

    /**
    * 每次工作空间启动时执行
    */
    @SerializedName("Start")
    @Expose
    private LifeCycleCommand [] Start;

    /**
    * 每次工作空间关闭时执行
    */
    @SerializedName("Destroy")
    @Expose
    private LifeCycleCommand [] Destroy;

    /**
     * Get 工作空间首次初始化时执行 
     * @return Init 工作空间首次初始化时执行
     */
    public LifeCycleCommand [] getInit() {
        return this.Init;
    }

    /**
     * Set 工作空间首次初始化时执行
     * @param Init 工作空间首次初始化时执行
     */
    public void setInit(LifeCycleCommand [] Init) {
        this.Init = Init;
    }

    /**
     * Get 每次工作空间启动时执行 
     * @return Start 每次工作空间启动时执行
     */
    public LifeCycleCommand [] getStart() {
        return this.Start;
    }

    /**
     * Set 每次工作空间启动时执行
     * @param Start 每次工作空间启动时执行
     */
    public void setStart(LifeCycleCommand [] Start) {
        this.Start = Start;
    }

    /**
     * Get 每次工作空间关闭时执行 
     * @return Destroy 每次工作空间关闭时执行
     */
    public LifeCycleCommand [] getDestroy() {
        return this.Destroy;
    }

    /**
     * Set 每次工作空间关闭时执行
     * @param Destroy 每次工作空间关闭时执行
     */
    public void setDestroy(LifeCycleCommand [] Destroy) {
        this.Destroy = Destroy;
    }

    public LifeCycle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifeCycle(LifeCycle source) {
        if (source.Init != null) {
            this.Init = new LifeCycleCommand[source.Init.length];
            for (int i = 0; i < source.Init.length; i++) {
                this.Init[i] = new LifeCycleCommand(source.Init[i]);
            }
        }
        if (source.Start != null) {
            this.Start = new LifeCycleCommand[source.Start.length];
            for (int i = 0; i < source.Start.length; i++) {
                this.Start[i] = new LifeCycleCommand(source.Start[i]);
            }
        }
        if (source.Destroy != null) {
            this.Destroy = new LifeCycleCommand[source.Destroy.length];
            for (int i = 0; i < source.Destroy.length; i++) {
                this.Destroy[i] = new LifeCycleCommand(source.Destroy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Init.", this.Init);
        this.setParamArrayObj(map, prefix + "Start.", this.Start);
        this.setParamArrayObj(map, prefix + "Destroy.", this.Destroy);

    }
}

