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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAccountsRequest extends AbstractModel {

    /**
    * <p>返回结果的条数，当返回结果达到 MaxItems 限制被截断时，返回参数IsTruncated将等于true。</p><p>取值范围：[1, 100]</p>
    */
    @SerializedName("MaxItems")
    @Expose
    private Long MaxItems;

    /**
    * <p>当请求的返回结果被截断时，可以使用Marker获取从当前截断位置之后的内容。</p>
    */
    @SerializedName("Marker")
    @Expose
    private String Marker;

    /**
    * <p>用户类型</p><p>枚举值：</p><ul><li>Owner： 主账号</li><li>SubUser： 普通子用户</li><li>CICUser： CIC 子用户</li><li>WechatCorpUser： 企业微信子用户</li><li>AgentIdentity： AgentIdentity子用户</li><li>Collaborator： 协作者</li><li>MessageReceiver： 消息接收者</li></ul>
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
     * Get <p>返回结果的条数，当返回结果达到 MaxItems 限制被截断时，返回参数IsTruncated将等于true。</p><p>取值范围：[1, 100]</p> 
     * @return MaxItems <p>返回结果的条数，当返回结果达到 MaxItems 限制被截断时，返回参数IsTruncated将等于true。</p><p>取值范围：[1, 100]</p>
     */
    public Long getMaxItems() {
        return this.MaxItems;
    }

    /**
     * Set <p>返回结果的条数，当返回结果达到 MaxItems 限制被截断时，返回参数IsTruncated将等于true。</p><p>取值范围：[1, 100]</p>
     * @param MaxItems <p>返回结果的条数，当返回结果达到 MaxItems 限制被截断时，返回参数IsTruncated将等于true。</p><p>取值范围：[1, 100]</p>
     */
    public void setMaxItems(Long MaxItems) {
        this.MaxItems = MaxItems;
    }

    /**
     * Get <p>当请求的返回结果被截断时，可以使用Marker获取从当前截断位置之后的内容。</p> 
     * @return Marker <p>当请求的返回结果被截断时，可以使用Marker获取从当前截断位置之后的内容。</p>
     */
    public String getMarker() {
        return this.Marker;
    }

    /**
     * Set <p>当请求的返回结果被截断时，可以使用Marker获取从当前截断位置之后的内容。</p>
     * @param Marker <p>当请求的返回结果被截断时，可以使用Marker获取从当前截断位置之后的内容。</p>
     */
    public void setMarker(String Marker) {
        this.Marker = Marker;
    }

    /**
     * Get <p>用户类型</p><p>枚举值：</p><ul><li>Owner： 主账号</li><li>SubUser： 普通子用户</li><li>CICUser： CIC 子用户</li><li>WechatCorpUser： 企业微信子用户</li><li>AgentIdentity： AgentIdentity子用户</li><li>Collaborator： 协作者</li><li>MessageReceiver： 消息接收者</li></ul> 
     * @return UserType <p>用户类型</p><p>枚举值：</p><ul><li>Owner： 主账号</li><li>SubUser： 普通子用户</li><li>CICUser： CIC 子用户</li><li>WechatCorpUser： 企业微信子用户</li><li>AgentIdentity： AgentIdentity子用户</li><li>Collaborator： 协作者</li><li>MessageReceiver： 消息接收者</li></ul>
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>用户类型</p><p>枚举值：</p><ul><li>Owner： 主账号</li><li>SubUser： 普通子用户</li><li>CICUser： CIC 子用户</li><li>WechatCorpUser： 企业微信子用户</li><li>AgentIdentity： AgentIdentity子用户</li><li>Collaborator： 协作者</li><li>MessageReceiver： 消息接收者</li></ul>
     * @param UserType <p>用户类型</p><p>枚举值：</p><ul><li>Owner： 主账号</li><li>SubUser： 普通子用户</li><li>CICUser： CIC 子用户</li><li>WechatCorpUser： 企业微信子用户</li><li>AgentIdentity： AgentIdentity子用户</li><li>Collaborator： 协作者</li><li>MessageReceiver： 消息接收者</li></ul>
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public ListAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAccountsRequest(ListAccountsRequest source) {
        if (source.MaxItems != null) {
            this.MaxItems = new Long(source.MaxItems);
        }
        if (source.Marker != null) {
            this.Marker = new String(source.Marker);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxItems", this.MaxItems);
        this.setParamSimple(map, prefix + "Marker", this.Marker);
        this.setParamSimple(map, prefix + "UserType", this.UserType);

    }
}

