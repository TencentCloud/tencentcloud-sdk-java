/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReleaseRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 发布描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 渠道业务ID
    */
    @SerializedName("ChannelBizIds")
    @Expose
    private String [] ChannelBizIds;

    /**
     * Get 应用ID 
     * @return BotBizId 应用ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID
     * @param BotBizId 应用ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 发布描述 
     * @return Desc 发布描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 发布描述
     * @param Desc 发布描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 渠道业务ID 
     * @return ChannelBizIds 渠道业务ID
     */
    public String [] getChannelBizIds() {
        return this.ChannelBizIds;
    }

    /**
     * Set 渠道业务ID
     * @param ChannelBizIds 渠道业务ID
     */
    public void setChannelBizIds(String [] ChannelBizIds) {
        this.ChannelBizIds = ChannelBizIds;
    }

    public CreateReleaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReleaseRequest(CreateReleaseRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ChannelBizIds != null) {
            this.ChannelBizIds = new String[source.ChannelBizIds.length];
            for (int i = 0; i < source.ChannelBizIds.length; i++) {
                this.ChannelBizIds[i] = new String(source.ChannelBizIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamArraySimple(map, prefix + "ChannelBizIds.", this.ChannelBizIds);

    }
}

