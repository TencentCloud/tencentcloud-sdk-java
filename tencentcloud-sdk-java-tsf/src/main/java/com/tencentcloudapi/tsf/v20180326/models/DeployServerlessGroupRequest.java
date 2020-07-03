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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployServerlessGroupRequest extends AbstractModel{

    /**
    * 部署组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 程序包ID
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 所需实例内存大小，取值为 1Gi 2Gi 4Gi 8Gi 16Gi，缺省为 1Gi，不传表示维持原态
    */
    @SerializedName("Memory")
    @Expose
    private String Memory;

    /**
    * 要求最小实例数，取值范围 [1, 4]，缺省为 1，不传表示维持原态
    */
    @SerializedName("InstanceRequest")
    @Expose
    private Long InstanceRequest;

    /**
    * 部署组启动参数，不传表示维持原态
    */
    @SerializedName("StartupParameters")
    @Expose
    private String StartupParameters;

    /**
     * Get 部署组ID 
     * @return GroupId 部署组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
     * @param GroupId 部署组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 程序包ID 
     * @return PkgId 程序包ID
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 程序包ID
     * @param PkgId 程序包ID
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 所需实例内存大小，取值为 1Gi 2Gi 4Gi 8Gi 16Gi，缺省为 1Gi，不传表示维持原态 
     * @return Memory 所需实例内存大小，取值为 1Gi 2Gi 4Gi 8Gi 16Gi，缺省为 1Gi，不传表示维持原态
     */
    public String getMemory() {
        return this.Memory;
    }

    /**
     * Set 所需实例内存大小，取值为 1Gi 2Gi 4Gi 8Gi 16Gi，缺省为 1Gi，不传表示维持原态
     * @param Memory 所需实例内存大小，取值为 1Gi 2Gi 4Gi 8Gi 16Gi，缺省为 1Gi，不传表示维持原态
     */
    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 要求最小实例数，取值范围 [1, 4]，缺省为 1，不传表示维持原态 
     * @return InstanceRequest 要求最小实例数，取值范围 [1, 4]，缺省为 1，不传表示维持原态
     */
    public Long getInstanceRequest() {
        return this.InstanceRequest;
    }

    /**
     * Set 要求最小实例数，取值范围 [1, 4]，缺省为 1，不传表示维持原态
     * @param InstanceRequest 要求最小实例数，取值范围 [1, 4]，缺省为 1，不传表示维持原态
     */
    public void setInstanceRequest(Long InstanceRequest) {
        this.InstanceRequest = InstanceRequest;
    }

    /**
     * Get 部署组启动参数，不传表示维持原态 
     * @return StartupParameters 部署组启动参数，不传表示维持原态
     */
    public String getStartupParameters() {
        return this.StartupParameters;
    }

    /**
     * Set 部署组启动参数，不传表示维持原态
     * @param StartupParameters 部署组启动参数，不传表示维持原态
     */
    public void setStartupParameters(String StartupParameters) {
        this.StartupParameters = StartupParameters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceRequest", this.InstanceRequest);
        this.setParamSimple(map, prefix + "StartupParameters", this.StartupParameters);

    }
}

