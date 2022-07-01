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

public class GetDownloadFlowUrlRequest extends AbstractModel{

    /**
    * 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 文件夹数组，签署流程总数不能超过50个，一个文件夹下，不能超过20个签署流程
    */
    @SerializedName("DownLoadFlows")
    @Expose
    private DownloadFlowInfo [] DownLoadFlows;

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
     * Get 文件夹数组，签署流程总数不能超过50个，一个文件夹下，不能超过20个签署流程 
     * @return DownLoadFlows 文件夹数组，签署流程总数不能超过50个，一个文件夹下，不能超过20个签署流程
     */
    public DownloadFlowInfo [] getDownLoadFlows() {
        return this.DownLoadFlows;
    }

    /**
     * Set 文件夹数组，签署流程总数不能超过50个，一个文件夹下，不能超过20个签署流程
     * @param DownLoadFlows 文件夹数组，签署流程总数不能超过50个，一个文件夹下，不能超过20个签署流程
     */
    public void setDownLoadFlows(DownloadFlowInfo [] DownLoadFlows) {
        this.DownLoadFlows = DownLoadFlows;
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

    public GetDownloadFlowUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDownloadFlowUrlRequest(GetDownloadFlowUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.DownLoadFlows != null) {
            this.DownLoadFlows = new DownloadFlowInfo[source.DownLoadFlows.length];
            for (int i = 0; i < source.DownLoadFlows.length; i++) {
                this.DownLoadFlows[i] = new DownloadFlowInfo(source.DownLoadFlows[i]);
            }
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
        this.setParamArrayObj(map, prefix + "DownLoadFlows.", this.DownLoadFlows);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

