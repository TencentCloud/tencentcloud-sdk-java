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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEipAclResponse extends AbstractModel{

    /**
    * ACL 实例 ID
    */
    @SerializedName("AclId")
    @Expose
    private String AclId;

    /**
    * ACL 实例状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * ACL 实例名称
    */
    @SerializedName("AclName")
    @Expose
    private String AclName;

    /**
    * ACL 实例创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ACL 实例 ID 
     * @return AclId ACL 实例 ID
     */
    public String getAclId() {
        return this.AclId;
    }

    /**
     * Set ACL 实例 ID
     * @param AclId ACL 实例 ID
     */
    public void setAclId(String AclId) {
        this.AclId = AclId;
    }

    /**
     * Get ACL 实例状态 
     * @return Status ACL 实例状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set ACL 实例状态
     * @param Status ACL 实例状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get ACL 实例名称 
     * @return AclName ACL 实例名称
     */
    public String getAclName() {
        return this.AclName;
    }

    /**
     * Set ACL 实例名称
     * @param AclName ACL 实例名称
     */
    public void setAclName(String AclName) {
        this.AclName = AclName;
    }

    /**
     * Get ACL 实例创建时间 
     * @return CreatedAt ACL 实例创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set ACL 实例创建时间
     * @param CreatedAt ACL 实例创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AclId", this.AclId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AclName", this.AclName);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

