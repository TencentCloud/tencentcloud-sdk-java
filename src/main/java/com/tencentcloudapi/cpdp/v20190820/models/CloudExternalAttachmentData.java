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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudExternalAttachmentData extends AbstractModel{

    /**
    * 渠道名
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 渠道透传字段，由各个渠道自行定义
    */
    @SerializedName("AttachmentData")
    @Expose
    private String AttachmentData;

    /**
     * Get 渠道名 
     * @return ChannelName 渠道名
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名
     * @param ChannelName 渠道名
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 渠道透传字段，由各个渠道自行定义 
     * @return AttachmentData 渠道透传字段，由各个渠道自行定义
     */
    public String getAttachmentData() {
        return this.AttachmentData;
    }

    /**
     * Set 渠道透传字段，由各个渠道自行定义
     * @param AttachmentData 渠道透传字段，由各个渠道自行定义
     */
    public void setAttachmentData(String AttachmentData) {
        this.AttachmentData = AttachmentData;
    }

    public CloudExternalAttachmentData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudExternalAttachmentData(CloudExternalAttachmentData source) {
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.AttachmentData != null) {
            this.AttachmentData = new String(source.AttachmentData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "AttachmentData", this.AttachmentData);

    }
}

