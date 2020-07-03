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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoGroupInfoRequest extends AbstractModel{

    /**
    * RO 组的 ID。
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;

    /**
    * RO 组的详细信息。
    */
    @SerializedName("RoGroupInfo")
    @Expose
    private RoGroupAttr RoGroupInfo;

    /**
    * RO 组内实例的权重。若修改 RO 组的权重模式为用户自定义模式（custom），则必须设置该参数，且需要设置每个 RO 实例的权重值。
    */
    @SerializedName("RoWeightValues")
    @Expose
    private RoWeightValue [] RoWeightValues;

    /**
    * 是否重新均衡 RO 组内的 RO 实例的负载。支持值包括：1 - 重新均衡负载；0 - 不重新均衡负载。默认值为 0。注意，设置为重新均衡负载是，RO 组内 RO 实例会有一次数据库连接瞬断，请确保应用程序能重连数据库。
    */
    @SerializedName("IsBalanceRoLoad")
    @Expose
    private Long IsBalanceRoLoad;

    /**
     * Get RO 组的 ID。 
     * @return RoGroupId RO 组的 ID。
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * Set RO 组的 ID。
     * @param RoGroupId RO 组的 ID。
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    /**
     * Get RO 组的详细信息。 
     * @return RoGroupInfo RO 组的详细信息。
     */
    public RoGroupAttr getRoGroupInfo() {
        return this.RoGroupInfo;
    }

    /**
     * Set RO 组的详细信息。
     * @param RoGroupInfo RO 组的详细信息。
     */
    public void setRoGroupInfo(RoGroupAttr RoGroupInfo) {
        this.RoGroupInfo = RoGroupInfo;
    }

    /**
     * Get RO 组内实例的权重。若修改 RO 组的权重模式为用户自定义模式（custom），则必须设置该参数，且需要设置每个 RO 实例的权重值。 
     * @return RoWeightValues RO 组内实例的权重。若修改 RO 组的权重模式为用户自定义模式（custom），则必须设置该参数，且需要设置每个 RO 实例的权重值。
     */
    public RoWeightValue [] getRoWeightValues() {
        return this.RoWeightValues;
    }

    /**
     * Set RO 组内实例的权重。若修改 RO 组的权重模式为用户自定义模式（custom），则必须设置该参数，且需要设置每个 RO 实例的权重值。
     * @param RoWeightValues RO 组内实例的权重。若修改 RO 组的权重模式为用户自定义模式（custom），则必须设置该参数，且需要设置每个 RO 实例的权重值。
     */
    public void setRoWeightValues(RoWeightValue [] RoWeightValues) {
        this.RoWeightValues = RoWeightValues;
    }

    /**
     * Get 是否重新均衡 RO 组内的 RO 实例的负载。支持值包括：1 - 重新均衡负载；0 - 不重新均衡负载。默认值为 0。注意，设置为重新均衡负载是，RO 组内 RO 实例会有一次数据库连接瞬断，请确保应用程序能重连数据库。 
     * @return IsBalanceRoLoad 是否重新均衡 RO 组内的 RO 实例的负载。支持值包括：1 - 重新均衡负载；0 - 不重新均衡负载。默认值为 0。注意，设置为重新均衡负载是，RO 组内 RO 实例会有一次数据库连接瞬断，请确保应用程序能重连数据库。
     */
    public Long getIsBalanceRoLoad() {
        return this.IsBalanceRoLoad;
    }

    /**
     * Set 是否重新均衡 RO 组内的 RO 实例的负载。支持值包括：1 - 重新均衡负载；0 - 不重新均衡负载。默认值为 0。注意，设置为重新均衡负载是，RO 组内 RO 实例会有一次数据库连接瞬断，请确保应用程序能重连数据库。
     * @param IsBalanceRoLoad 是否重新均衡 RO 组内的 RO 实例的负载。支持值包括：1 - 重新均衡负载；0 - 不重新均衡负载。默认值为 0。注意，设置为重新均衡负载是，RO 组内 RO 实例会有一次数据库连接瞬断，请确保应用程序能重连数据库。
     */
    public void setIsBalanceRoLoad(Long IsBalanceRoLoad) {
        this.IsBalanceRoLoad = IsBalanceRoLoad;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoGroupId", this.RoGroupId);
        this.setParamObj(map, prefix + "RoGroupInfo.", this.RoGroupInfo);
        this.setParamArrayObj(map, prefix + "RoWeightValues.", this.RoWeightValues);
        this.setParamSimple(map, prefix + "IsBalanceRoLoad", this.IsBalanceRoLoad);

    }
}

