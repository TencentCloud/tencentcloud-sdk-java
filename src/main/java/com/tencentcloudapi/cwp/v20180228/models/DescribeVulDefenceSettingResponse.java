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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulDefenceSettingResponse extends AbstractModel {

    /**
    * 防御开关，0 关闭 1 开启
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 影响范围：1 全网旗舰版主机，0 quuid列表主机
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * 影响主机quuid列表
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * 当前旗舰版主机数量
    */
    @SerializedName("FlagshipCount")
    @Expose
    private Long FlagshipCount;

    /**
    * 影响主机id列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 新增旗舰版主机自动加入;1是，0否 
    */
    @SerializedName("AutoInclude")
    @Expose
    private Long AutoInclude;

    /**
    * 排除的主机id列表
    */
    @SerializedName("ExcludeInstanceIds")
    @Expose
    private String [] ExcludeInstanceIds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 防御开关，0 关闭 1 开启 
     * @return Enable 防御开关，0 关闭 1 开启
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 防御开关，0 关闭 1 开启
     * @param Enable 防御开关，0 关闭 1 开启
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 影响范围：1 全网旗舰版主机，0 quuid列表主机 
     * @return Scope 影响范围：1 全网旗舰版主机，0 quuid列表主机
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 影响范围：1 全网旗舰版主机，0 quuid列表主机
     * @param Scope 影响范围：1 全网旗舰版主机，0 quuid列表主机
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 影响主机quuid列表 
     * @return Quuids 影响主机quuid列表
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 影响主机quuid列表
     * @param Quuids 影响主机quuid列表
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get 当前旗舰版主机数量 
     * @return FlagshipCount 当前旗舰版主机数量
     */
    public Long getFlagshipCount() {
        return this.FlagshipCount;
    }

    /**
     * Set 当前旗舰版主机数量
     * @param FlagshipCount 当前旗舰版主机数量
     */
    public void setFlagshipCount(Long FlagshipCount) {
        this.FlagshipCount = FlagshipCount;
    }

    /**
     * Get 影响主机id列表 
     * @return InstanceIds 影响主机id列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 影响主机id列表
     * @param InstanceIds 影响主机id列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 新增旗舰版主机自动加入;1是，0否  
     * @return AutoInclude 新增旗舰版主机自动加入;1是，0否 
     */
    public Long getAutoInclude() {
        return this.AutoInclude;
    }

    /**
     * Set 新增旗舰版主机自动加入;1是，0否 
     * @param AutoInclude 新增旗舰版主机自动加入;1是，0否 
     */
    public void setAutoInclude(Long AutoInclude) {
        this.AutoInclude = AutoInclude;
    }

    /**
     * Get 排除的主机id列表 
     * @return ExcludeInstanceIds 排除的主机id列表
     */
    public String [] getExcludeInstanceIds() {
        return this.ExcludeInstanceIds;
    }

    /**
     * Set 排除的主机id列表
     * @param ExcludeInstanceIds 排除的主机id列表
     */
    public void setExcludeInstanceIds(String [] ExcludeInstanceIds) {
        this.ExcludeInstanceIds = ExcludeInstanceIds;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVulDefenceSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulDefenceSettingResponse(DescribeVulDefenceSettingResponse source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.FlagshipCount != null) {
            this.FlagshipCount = new Long(source.FlagshipCount);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.AutoInclude != null) {
            this.AutoInclude = new Long(source.AutoInclude);
        }
        if (source.ExcludeInstanceIds != null) {
            this.ExcludeInstanceIds = new String[source.ExcludeInstanceIds.length];
            for (int i = 0; i < source.ExcludeInstanceIds.length; i++) {
                this.ExcludeInstanceIds[i] = new String(source.ExcludeInstanceIds[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "FlagshipCount", this.FlagshipCount);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "AutoInclude", this.AutoInclude);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIds.", this.ExcludeInstanceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

