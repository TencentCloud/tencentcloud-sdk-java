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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateQualityControlTaskRequest extends AbstractModel{

    /**
    * 质检任务参数
    */
    @SerializedName("QualityControlInfo")
    @Expose
    private QualityControlInfo QualityControlInfo;

    /**
    * 视频源信息
    */
    @SerializedName("DownInfo")
    @Expose
    private DownInfo DownInfo;

    /**
    * 任务结果回调地址信息
    */
    @SerializedName("CallbackInfo")
    @Expose
    private CallbackInfo CallbackInfo;

    /**
     * Get 质检任务参数 
     * @return QualityControlInfo 质检任务参数
     */
    public QualityControlInfo getQualityControlInfo() {
        return this.QualityControlInfo;
    }

    /**
     * Set 质检任务参数
     * @param QualityControlInfo 质检任务参数
     */
    public void setQualityControlInfo(QualityControlInfo QualityControlInfo) {
        this.QualityControlInfo = QualityControlInfo;
    }

    /**
     * Get 视频源信息 
     * @return DownInfo 视频源信息
     */
    public DownInfo getDownInfo() {
        return this.DownInfo;
    }

    /**
     * Set 视频源信息
     * @param DownInfo 视频源信息
     */
    public void setDownInfo(DownInfo DownInfo) {
        this.DownInfo = DownInfo;
    }

    /**
     * Get 任务结果回调地址信息 
     * @return CallbackInfo 任务结果回调地址信息
     */
    public CallbackInfo getCallbackInfo() {
        return this.CallbackInfo;
    }

    /**
     * Set 任务结果回调地址信息
     * @param CallbackInfo 任务结果回调地址信息
     */
    public void setCallbackInfo(CallbackInfo CallbackInfo) {
        this.CallbackInfo = CallbackInfo;
    }

    public CreateQualityControlTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateQualityControlTaskRequest(CreateQualityControlTaskRequest source) {
        if (source.QualityControlInfo != null) {
            this.QualityControlInfo = new QualityControlInfo(source.QualityControlInfo);
        }
        if (source.DownInfo != null) {
            this.DownInfo = new DownInfo(source.DownInfo);
        }
        if (source.CallbackInfo != null) {
            this.CallbackInfo = new CallbackInfo(source.CallbackInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "QualityControlInfo.", this.QualityControlInfo);
        this.setParamObj(map, prefix + "DownInfo.", this.DownInfo);
        this.setParamObj(map, prefix + "CallbackInfo.", this.CallbackInfo);

    }
}

