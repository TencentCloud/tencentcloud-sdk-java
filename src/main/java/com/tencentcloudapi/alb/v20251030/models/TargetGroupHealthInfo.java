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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupHealthInfo extends AbstractModel {

    /**
    * 是否开启健康检查。
    */
    @SerializedName("HealthCheckEnabled")
    @Expose
    private Boolean HealthCheckEnabled;

    /**
    * 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 服务健康检查状态列表。
    */
    @SerializedName("TargetHealthStatusInfos")
    @Expose
    private TargetHealthStatusInfo [] TargetHealthStatusInfos;

    /**
    * 转发动作类型。取值：
TargetGroup：转发至目标组。
Redirect：重定向。
FixedResponse：返回固定内容。
Rewrite：重写。
InsertHeader：写入HTTP Header。
RemoveHeader：删除HTTP Header。
转发动作必选包含TargetGroup,Redirect,FixedResponse其中一个，并且执行顺序放在最后。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 是否开启健康检查。 
     * @return HealthCheckEnabled 是否开启健康检查。
     */
    public Boolean getHealthCheckEnabled() {
        return this.HealthCheckEnabled;
    }

    /**
     * Set 是否开启健康检查。
     * @param HealthCheckEnabled 是否开启健康检查。
     */
    public void setHealthCheckEnabled(Boolean HealthCheckEnabled) {
        this.HealthCheckEnabled = HealthCheckEnabled;
    }

    /**
     * Get 目标组 ID，格式为 lbtg- 后接 8 位字母数字。 
     * @return TargetGroupId 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     * @param TargetGroupId 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 服务健康检查状态列表。 
     * @return TargetHealthStatusInfos 服务健康检查状态列表。
     */
    public TargetHealthStatusInfo [] getTargetHealthStatusInfos() {
        return this.TargetHealthStatusInfos;
    }

    /**
     * Set 服务健康检查状态列表。
     * @param TargetHealthStatusInfos 服务健康检查状态列表。
     */
    public void setTargetHealthStatusInfos(TargetHealthStatusInfo [] TargetHealthStatusInfos) {
        this.TargetHealthStatusInfos = TargetHealthStatusInfos;
    }

    /**
     * Get 转发动作类型。取值：
TargetGroup：转发至目标组。
Redirect：重定向。
FixedResponse：返回固定内容。
Rewrite：重写。
InsertHeader：写入HTTP Header。
RemoveHeader：删除HTTP Header。
转发动作必选包含TargetGroup,Redirect,FixedResponse其中一个，并且执行顺序放在最后。 
     * @return Type 转发动作类型。取值：
TargetGroup：转发至目标组。
Redirect：重定向。
FixedResponse：返回固定内容。
Rewrite：重写。
InsertHeader：写入HTTP Header。
RemoveHeader：删除HTTP Header。
转发动作必选包含TargetGroup,Redirect,FixedResponse其中一个，并且执行顺序放在最后。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 转发动作类型。取值：
TargetGroup：转发至目标组。
Redirect：重定向。
FixedResponse：返回固定内容。
Rewrite：重写。
InsertHeader：写入HTTP Header。
RemoveHeader：删除HTTP Header。
转发动作必选包含TargetGroup,Redirect,FixedResponse其中一个，并且执行顺序放在最后。
     * @param Type 转发动作类型。取值：
TargetGroup：转发至目标组。
Redirect：重定向。
FixedResponse：返回固定内容。
Rewrite：重写。
InsertHeader：写入HTTP Header。
RemoveHeader：删除HTTP Header。
转发动作必选包含TargetGroup,Redirect,FixedResponse其中一个，并且执行顺序放在最后。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public TargetGroupHealthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupHealthInfo(TargetGroupHealthInfo source) {
        if (source.HealthCheckEnabled != null) {
            this.HealthCheckEnabled = new Boolean(source.HealthCheckEnabled);
        }
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.TargetHealthStatusInfos != null) {
            this.TargetHealthStatusInfos = new TargetHealthStatusInfo[source.TargetHealthStatusInfos.length];
            for (int i = 0; i < source.TargetHealthStatusInfos.length; i++) {
                this.TargetHealthStatusInfos[i] = new TargetHealthStatusInfo(source.TargetHealthStatusInfos[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthCheckEnabled", this.HealthCheckEnabled);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamArrayObj(map, prefix + "TargetHealthStatusInfos.", this.TargetHealthStatusInfos);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

