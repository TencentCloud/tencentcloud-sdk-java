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

public class CreateEditingTaskRequest extends AbstractModel{

    /**
    * 智能编辑任务参数。
    */
    @SerializedName("EditingInfo")
    @Expose
    private EditingInfo EditingInfo;

    /**
    * 视频源信息。
    */
    @SerializedName("DownInfo")
    @Expose
    private DownInfo DownInfo;

    /**
    * 结果存储信息。对于包含智能拆条、智能集锦或者智能封面的任务必选。
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
     * Get 智能编辑任务参数。 
     * @return EditingInfo 智能编辑任务参数。
     */
    public EditingInfo getEditingInfo() {
        return this.EditingInfo;
    }

    /**
     * Set 智能编辑任务参数。
     * @param EditingInfo 智能编辑任务参数。
     */
    public void setEditingInfo(EditingInfo EditingInfo) {
        this.EditingInfo = EditingInfo;
    }

    /**
     * Get 视频源信息。 
     * @return DownInfo 视频源信息。
     */
    public DownInfo getDownInfo() {
        return this.DownInfo;
    }

    /**
     * Set 视频源信息。
     * @param DownInfo 视频源信息。
     */
    public void setDownInfo(DownInfo DownInfo) {
        this.DownInfo = DownInfo;
    }

    /**
     * Get 结果存储信息。对于包含智能拆条、智能集锦或者智能封面的任务必选。 
     * @return SaveInfo 结果存储信息。对于包含智能拆条、智能集锦或者智能封面的任务必选。
     */
    public SaveInfo getSaveInfo() {
        return this.SaveInfo;
    }

    /**
     * Set 结果存储信息。对于包含智能拆条、智能集锦或者智能封面的任务必选。
     * @param SaveInfo 结果存储信息。对于包含智能拆条、智能集锦或者智能封面的任务必选。
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EditingInfo.", this.EditingInfo);
        this.setParamObj(map, prefix + "DownInfo.", this.DownInfo);
        this.setParamObj(map, prefix + "SaveInfo.", this.SaveInfo);
        this.setParamObj(map, prefix + "CallbackInfo.", this.CallbackInfo);

    }
}

