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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUsersInOrgNodeResponse extends AbstractModel{

    /**
    * 机构子节点下的用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgNodeChildUserInfo")
    @Expose
    private OrgNodeChildUserInfo [] OrgNodeChildUserInfo;

    /**
    * 机构ID，是机构节点全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgNodeId")
    @Expose
    private String OrgNodeId;

    /**
    * 用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserInfo")
    @Expose
    private UserInfo [] UserInfo;

    /**
    * 当前机构节点下的用户总数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalUserNum")
    @Expose
    private Long TotalUserNum;

    /**
    * 组织机构ID路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgNodeIdPath")
    @Expose
    private String OrgNodeIdPath;

    /**
    * 组织机构名称路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgNodeNamePath")
    @Expose
    private String OrgNodeNamePath;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 机构子节点下的用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgNodeChildUserInfo 机构子节点下的用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OrgNodeChildUserInfo [] getOrgNodeChildUserInfo() {
        return this.OrgNodeChildUserInfo;
    }

    /**
     * Set 机构子节点下的用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgNodeChildUserInfo 机构子节点下的用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgNodeChildUserInfo(OrgNodeChildUserInfo [] OrgNodeChildUserInfo) {
        this.OrgNodeChildUserInfo = OrgNodeChildUserInfo;
    }

    /**
     * Get 机构ID，是机构节点全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgNodeId 机构ID，是机构节点全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgNodeId() {
        return this.OrgNodeId;
    }

    /**
     * Set 机构ID，是机构节点全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgNodeId 机构ID，是机构节点全局唯一标识，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgNodeId(String OrgNodeId) {
        this.OrgNodeId = OrgNodeId;
    }

    /**
     * Get 用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserInfo 用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserInfo [] getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserInfo 用户信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserInfo(UserInfo [] UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get 当前机构节点下的用户总数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalUserNum 当前机构节点下的用户总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalUserNum() {
        return this.TotalUserNum;
    }

    /**
     * Set 当前机构节点下的用户总数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalUserNum 当前机构节点下的用户总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalUserNum(Long TotalUserNum) {
        this.TotalUserNum = TotalUserNum;
    }

    /**
     * Get 组织机构ID路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgNodeIdPath 组织机构ID路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgNodeIdPath() {
        return this.OrgNodeIdPath;
    }

    /**
     * Set 组织机构ID路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgNodeIdPath 组织机构ID路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgNodeIdPath(String OrgNodeIdPath) {
        this.OrgNodeIdPath = OrgNodeIdPath;
    }

    /**
     * Get 组织机构名称路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgNodeNamePath 组织机构名称路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgNodeNamePath() {
        return this.OrgNodeNamePath;
    }

    /**
     * Set 组织机构名称路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgNodeNamePath 组织机构名称路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgNodeNamePath(String OrgNodeNamePath) {
        this.OrgNodeNamePath = OrgNodeNamePath;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListUsersInOrgNodeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUsersInOrgNodeResponse(ListUsersInOrgNodeResponse source) {
        if (source.OrgNodeChildUserInfo != null) {
            this.OrgNodeChildUserInfo = new OrgNodeChildUserInfo[source.OrgNodeChildUserInfo.length];
            for (int i = 0; i < source.OrgNodeChildUserInfo.length; i++) {
                this.OrgNodeChildUserInfo[i] = new OrgNodeChildUserInfo(source.OrgNodeChildUserInfo[i]);
            }
        }
        if (source.OrgNodeId != null) {
            this.OrgNodeId = new String(source.OrgNodeId);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new UserInfo[source.UserInfo.length];
            for (int i = 0; i < source.UserInfo.length; i++) {
                this.UserInfo[i] = new UserInfo(source.UserInfo[i]);
            }
        }
        if (source.TotalUserNum != null) {
            this.TotalUserNum = new Long(source.TotalUserNum);
        }
        if (source.OrgNodeIdPath != null) {
            this.OrgNodeIdPath = new String(source.OrgNodeIdPath);
        }
        if (source.OrgNodeNamePath != null) {
            this.OrgNodeNamePath = new String(source.OrgNodeNamePath);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "OrgNodeChildUserInfo.", this.OrgNodeChildUserInfo);
        this.setParamSimple(map, prefix + "OrgNodeId", this.OrgNodeId);
        this.setParamArrayObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "TotalUserNum", this.TotalUserNum);
        this.setParamSimple(map, prefix + "OrgNodeIdPath", this.OrgNodeIdPath);
        this.setParamSimple(map, prefix + "OrgNodeNamePath", this.OrgNodeNamePath);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

