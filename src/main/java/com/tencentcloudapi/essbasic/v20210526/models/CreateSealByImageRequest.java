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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSealByImageRequest extends AbstractModel{

    /**
    * 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 印章名称，最大长度不超过50字符
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * 印章图片base64，大小不超过10M（原始图片不超过7.6M）
    */
    @SerializedName("SealImage")
    @Expose
    private String SealImage;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。 
     * @return Agent 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
     * @param Agent 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 印章名称，最大长度不超过50字符 
     * @return SealName 印章名称，最大长度不超过50字符
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set 印章名称，最大长度不超过50字符
     * @param SealName 印章名称，最大长度不超过50字符
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get 印章图片base64，大小不超过10M（原始图片不超过7.6M） 
     * @return SealImage 印章图片base64，大小不超过10M（原始图片不超过7.6M）
     */
    public String getSealImage() {
        return this.SealImage;
    }

    /**
     * Set 印章图片base64，大小不超过10M（原始图片不超过7.6M）
     * @param SealImage 印章图片base64，大小不超过10M（原始图片不超过7.6M）
     */
    public void setSealImage(String SealImage) {
        this.SealImage = SealImage;
    }

    /**
     * Get 操作者的信息 
     * @return Operator 操作者的信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息
     * @param Operator 操作者的信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public CreateSealByImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSealByImageRequest(CreateSealByImageRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.SealImage != null) {
            this.SealImage = new String(source.SealImage);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamSimple(map, prefix + "SealImage", this.SealImage);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

