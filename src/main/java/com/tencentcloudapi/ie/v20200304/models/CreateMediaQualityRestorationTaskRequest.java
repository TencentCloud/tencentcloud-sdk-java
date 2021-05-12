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

public class CreateMediaQualityRestorationTaskRequest extends AbstractModel{

    /**
    * 源文件地址。
    */
    @SerializedName("DownInfo")
    @Expose
    private DownInfo DownInfo;

    /**
    * 画质重生任务参数信息。
    */
    @SerializedName("TransInfo")
    @Expose
    private SubTaskTranscodeInfo [] TransInfo;

    /**
    * 任务结束后文件存储信息。
    */
    @SerializedName("SaveInfo")
    @Expose
    private SaveInfo SaveInfo;

    /**
    * 任务结果回调地址信息。
    */
    @SerializedName("CallbackInfo")
    @Expose
    private CallbackInfo CallbackInfo;

    /**
     * Get 源文件地址。 
     * @return DownInfo 源文件地址。
     */
    public DownInfo getDownInfo() {
        return this.DownInfo;
    }

    /**
     * Set 源文件地址。
     * @param DownInfo 源文件地址。
     */
    public void setDownInfo(DownInfo DownInfo) {
        this.DownInfo = DownInfo;
    }

    /**
     * Get 画质重生任务参数信息。 
     * @return TransInfo 画质重生任务参数信息。
     */
    public SubTaskTranscodeInfo [] getTransInfo() {
        return this.TransInfo;
    }

    /**
     * Set 画质重生任务参数信息。
     * @param TransInfo 画质重生任务参数信息。
     */
    public void setTransInfo(SubTaskTranscodeInfo [] TransInfo) {
        this.TransInfo = TransInfo;
    }

    /**
     * Get 任务结束后文件存储信息。 
     * @return SaveInfo 任务结束后文件存储信息。
     */
    public SaveInfo getSaveInfo() {
        return this.SaveInfo;
    }

    /**
     * Set 任务结束后文件存储信息。
     * @param SaveInfo 任务结束后文件存储信息。
     */
    public void setSaveInfo(SaveInfo SaveInfo) {
        this.SaveInfo = SaveInfo;
    }

    /**
     * Get 任务结果回调地址信息。 
     * @return CallbackInfo 任务结果回调地址信息。
     */
    public CallbackInfo getCallbackInfo() {
        return this.CallbackInfo;
    }

    /**
     * Set 任务结果回调地址信息。
     * @param CallbackInfo 任务结果回调地址信息。
     */
    public void setCallbackInfo(CallbackInfo CallbackInfo) {
        this.CallbackInfo = CallbackInfo;
    }

    public CreateMediaQualityRestorationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMediaQualityRestorationTaskRequest(CreateMediaQualityRestorationTaskRequest source) {
        if (source.DownInfo != null) {
            this.DownInfo = new DownInfo(source.DownInfo);
        }
        if (source.TransInfo != null) {
            this.TransInfo = new SubTaskTranscodeInfo[source.TransInfo.length];
            for (int i = 0; i < source.TransInfo.length; i++) {
                this.TransInfo[i] = new SubTaskTranscodeInfo(source.TransInfo[i]);
            }
        }
        if (source.SaveInfo != null) {
            this.SaveInfo = new SaveInfo(source.SaveInfo);
        }
        if (source.CallbackInfo != null) {
            this.CallbackInfo = new CallbackInfo(source.CallbackInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DownInfo.", this.DownInfo);
        this.setParamArrayObj(map, prefix + "TransInfo.", this.TransInfo);
        this.setParamObj(map, prefix + "SaveInfo.", this.SaveInfo);
        this.setParamObj(map, prefix + "CallbackInfo.", this.CallbackInfo);

    }
}

