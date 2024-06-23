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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetWsTokenRequest extends AbstractModel {

    /**
    * 接入类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 应用AppKey
    */
    @SerializedName("BotAppKey")
    @Expose
    private String BotAppKey;

    /**
    * 坐席ID
    */
    @SerializedName("VisitorBizId")
    @Expose
    private String VisitorBizId;

    /**
    * 坐席标签
    */
    @SerializedName("VisitorLabels")
    @Expose
    private GetWsTokenReq_Label [] VisitorLabels;

    /**
     * Get 接入类型 
     * @return Type 接入类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 接入类型
     * @param Type 接入类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 应用AppKey 
     * @return BotAppKey 应用AppKey
     */
    public String getBotAppKey() {
        return this.BotAppKey;
    }

    /**
     * Set 应用AppKey
     * @param BotAppKey 应用AppKey
     */
    public void setBotAppKey(String BotAppKey) {
        this.BotAppKey = BotAppKey;
    }

    /**
     * Get 坐席ID 
     * @return VisitorBizId 坐席ID
     */
    public String getVisitorBizId() {
        return this.VisitorBizId;
    }

    /**
     * Set 坐席ID
     * @param VisitorBizId 坐席ID
     */
    public void setVisitorBizId(String VisitorBizId) {
        this.VisitorBizId = VisitorBizId;
    }

    /**
     * Get 坐席标签 
     * @return VisitorLabels 坐席标签
     */
    public GetWsTokenReq_Label [] getVisitorLabels() {
        return this.VisitorLabels;
    }

    /**
     * Set 坐席标签
     * @param VisitorLabels 坐席标签
     */
    public void setVisitorLabels(GetWsTokenReq_Label [] VisitorLabels) {
        this.VisitorLabels = VisitorLabels;
    }

    public GetWsTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWsTokenRequest(GetWsTokenRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.BotAppKey != null) {
            this.BotAppKey = new String(source.BotAppKey);
        }
        if (source.VisitorBizId != null) {
            this.VisitorBizId = new String(source.VisitorBizId);
        }
        if (source.VisitorLabels != null) {
            this.VisitorLabels = new GetWsTokenReq_Label[source.VisitorLabels.length];
            for (int i = 0; i < source.VisitorLabels.length; i++) {
                this.VisitorLabels[i] = new GetWsTokenReq_Label(source.VisitorLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "BotAppKey", this.BotAppKey);
        this.setParamSimple(map, prefix + "VisitorBizId", this.VisitorBizId);
        this.setParamArrayObj(map, prefix + "VisitorLabels.", this.VisitorLabels);

    }
}

