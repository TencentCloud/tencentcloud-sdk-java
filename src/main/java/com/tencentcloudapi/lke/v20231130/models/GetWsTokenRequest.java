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
    * 应用AppKey（应用发布后在应用页面[发布管理]-[调用信息]-[API管理]处获取）
    */
    @SerializedName("BotAppKey")
    @Expose
    private String BotAppKey;

    /**
    * 访客ID（外部输入，建议唯一，标识当前接入会话的用户）
    */
    @SerializedName("VisitorBizId")
    @Expose
    private String VisitorBizId;

    /**
    * 知识标签（用于知识库中知识的检索过滤）
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
     * Get 应用AppKey（应用发布后在应用页面[发布管理]-[调用信息]-[API管理]处获取） 
     * @return BotAppKey 应用AppKey（应用发布后在应用页面[发布管理]-[调用信息]-[API管理]处获取）
     */
    public String getBotAppKey() {
        return this.BotAppKey;
    }

    /**
     * Set 应用AppKey（应用发布后在应用页面[发布管理]-[调用信息]-[API管理]处获取）
     * @param BotAppKey 应用AppKey（应用发布后在应用页面[发布管理]-[调用信息]-[API管理]处获取）
     */
    public void setBotAppKey(String BotAppKey) {
        this.BotAppKey = BotAppKey;
    }

    /**
     * Get 访客ID（外部输入，建议唯一，标识当前接入会话的用户） 
     * @return VisitorBizId 访客ID（外部输入，建议唯一，标识当前接入会话的用户）
     */
    public String getVisitorBizId() {
        return this.VisitorBizId;
    }

    /**
     * Set 访客ID（外部输入，建议唯一，标识当前接入会话的用户）
     * @param VisitorBizId 访客ID（外部输入，建议唯一，标识当前接入会话的用户）
     */
    public void setVisitorBizId(String VisitorBizId) {
        this.VisitorBizId = VisitorBizId;
    }

    /**
     * Get 知识标签（用于知识库中知识的检索过滤） 
     * @return VisitorLabels 知识标签（用于知识库中知识的检索过滤）
     */
    public GetWsTokenReq_Label [] getVisitorLabels() {
        return this.VisitorLabels;
    }

    /**
     * Set 知识标签（用于知识库中知识的检索过滤）
     * @param VisitorLabels 知识标签（用于知识库中知识的检索过滤）
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

