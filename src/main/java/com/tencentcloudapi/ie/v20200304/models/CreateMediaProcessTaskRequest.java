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

public class CreateMediaProcessTaskRequest extends AbstractModel{

    /**
    * 编辑处理任务参数。
    */
    @SerializedName("MediaProcessInfo")
    @Expose
    private MediaProcessInfo MediaProcessInfo;

    /**
    * 编辑处理任务输入源列表。
    */
    @SerializedName("SourceInfoSet")
    @Expose
    private MediaSourceInfo [] SourceInfoSet;

    /**
    * 结果存储信息，对于涉及存储的请求必选。部子任务支持数组备份写，具体以对应任务文档为准。
    */
    @SerializedName("SaveInfoSet")
    @Expose
    private SaveInfo [] SaveInfoSet;

    /**
    * 任务结果回调地址信息。部子任务支持数组备份回调，具体以对应任务文档为准。
    */
    @SerializedName("CallbackInfoSet")
    @Expose
    private CallbackInfo [] CallbackInfoSet;

    /**
     * Get 编辑处理任务参数。 
     * @return MediaProcessInfo 编辑处理任务参数。
     */
    public MediaProcessInfo getMediaProcessInfo() {
        return this.MediaProcessInfo;
    }

    /**
     * Set 编辑处理任务参数。
     * @param MediaProcessInfo 编辑处理任务参数。
     */
    public void setMediaProcessInfo(MediaProcessInfo MediaProcessInfo) {
        this.MediaProcessInfo = MediaProcessInfo;
    }

    /**
     * Get 编辑处理任务输入源列表。 
     * @return SourceInfoSet 编辑处理任务输入源列表。
     */
    public MediaSourceInfo [] getSourceInfoSet() {
        return this.SourceInfoSet;
    }

    /**
     * Set 编辑处理任务输入源列表。
     * @param SourceInfoSet 编辑处理任务输入源列表。
     */
    public void setSourceInfoSet(MediaSourceInfo [] SourceInfoSet) {
        this.SourceInfoSet = SourceInfoSet;
    }

    /**
     * Get 结果存储信息，对于涉及存储的请求必选。部子任务支持数组备份写，具体以对应任务文档为准。 
     * @return SaveInfoSet 结果存储信息，对于涉及存储的请求必选。部子任务支持数组备份写，具体以对应任务文档为准。
     */
    public SaveInfo [] getSaveInfoSet() {
        return this.SaveInfoSet;
    }

    /**
     * Set 结果存储信息，对于涉及存储的请求必选。部子任务支持数组备份写，具体以对应任务文档为准。
     * @param SaveInfoSet 结果存储信息，对于涉及存储的请求必选。部子任务支持数组备份写，具体以对应任务文档为准。
     */
    public void setSaveInfoSet(SaveInfo [] SaveInfoSet) {
        this.SaveInfoSet = SaveInfoSet;
    }

    /**
     * Get 任务结果回调地址信息。部子任务支持数组备份回调，具体以对应任务文档为准。 
     * @return CallbackInfoSet 任务结果回调地址信息。部子任务支持数组备份回调，具体以对应任务文档为准。
     */
    public CallbackInfo [] getCallbackInfoSet() {
        return this.CallbackInfoSet;
    }

    /**
     * Set 任务结果回调地址信息。部子任务支持数组备份回调，具体以对应任务文档为准。
     * @param CallbackInfoSet 任务结果回调地址信息。部子任务支持数组备份回调，具体以对应任务文档为准。
     */
    public void setCallbackInfoSet(CallbackInfo [] CallbackInfoSet) {
        this.CallbackInfoSet = CallbackInfoSet;
    }

    public CreateMediaProcessTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMediaProcessTaskRequest(CreateMediaProcessTaskRequest source) {
        if (source.MediaProcessInfo != null) {
            this.MediaProcessInfo = new MediaProcessInfo(source.MediaProcessInfo);
        }
        if (source.SourceInfoSet != null) {
            this.SourceInfoSet = new MediaSourceInfo[source.SourceInfoSet.length];
            for (int i = 0; i < source.SourceInfoSet.length; i++) {
                this.SourceInfoSet[i] = new MediaSourceInfo(source.SourceInfoSet[i]);
            }
        }
        if (source.SaveInfoSet != null) {
            this.SaveInfoSet = new SaveInfo[source.SaveInfoSet.length];
            for (int i = 0; i < source.SaveInfoSet.length; i++) {
                this.SaveInfoSet[i] = new SaveInfo(source.SaveInfoSet[i]);
            }
        }
        if (source.CallbackInfoSet != null) {
            this.CallbackInfoSet = new CallbackInfo[source.CallbackInfoSet.length];
            for (int i = 0; i < source.CallbackInfoSet.length; i++) {
                this.CallbackInfoSet[i] = new CallbackInfo(source.CallbackInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MediaProcessInfo.", this.MediaProcessInfo);
        this.setParamArrayObj(map, prefix + "SourceInfoSet.", this.SourceInfoSet);
        this.setParamArrayObj(map, prefix + "SaveInfoSet.", this.SaveInfoSet);
        this.setParamArrayObj(map, prefix + "CallbackInfoSet.", this.CallbackInfoSet);

    }
}

