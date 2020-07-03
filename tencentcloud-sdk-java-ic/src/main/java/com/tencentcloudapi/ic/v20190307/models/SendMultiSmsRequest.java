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
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendMultiSmsRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("Sdkappid")
    @Expose
    private String Sdkappid;

    /**
    * 卡片列表
    */
    @SerializedName("Iccids")
    @Expose
    private String [] Iccids;

    /**
    * 短信内容 长度限制 70
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 应用ID 
     * @return Sdkappid 应用ID
     */
    public String getSdkappid() {
        return this.Sdkappid;
    }

    /**
     * Set 应用ID
     * @param Sdkappid 应用ID
     */
    public void setSdkappid(String Sdkappid) {
        this.Sdkappid = Sdkappid;
    }

    /**
     * Get 卡片列表 
     * @return Iccids 卡片列表
     */
    public String [] getIccids() {
        return this.Iccids;
    }

    /**
     * Set 卡片列表
     * @param Iccids 卡片列表
     */
    public void setIccids(String [] Iccids) {
        this.Iccids = Iccids;
    }

    /**
     * Get 短信内容 长度限制 70 
     * @return Content 短信内容 长度限制 70
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 短信内容 长度限制 70
     * @param Content 短信内容 长度限制 70
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sdkappid", this.Sdkappid);
        this.setParamArraySimple(map, prefix + "Iccids.", this.Iccids);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

