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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceEnvironmentStrategy extends AbstractModel{

    /**
    * 环境名。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 访问服务对应环境的url。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 发布状态。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 发布的版本号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 限流值。
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * 最大限流值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxStrategy")
    @Expose
    private Long MaxStrategy;

    /**
     * Get 环境名。 
     * @return EnvironmentName 环境名。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 环境名。
     * @param EnvironmentName 环境名。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 访问服务对应环境的url。 
     * @return Url 访问服务对应环境的url。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 访问服务对应环境的url。
     * @param Url 访问服务对应环境的url。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 发布状态。 
     * @return Status 发布状态。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 发布状态。
     * @param Status 发布状态。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 发布的版本号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionName 发布的版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 发布的版本号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionName 发布的版本号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 限流值。 
     * @return Strategy 限流值。
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 限流值。
     * @param Strategy 限流值。
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 最大限流值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxStrategy 最大限流值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxStrategy() {
        return this.MaxStrategy;
    }

    /**
     * Set 最大限流值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxStrategy 最大限流值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxStrategy(Long MaxStrategy) {
        this.MaxStrategy = MaxStrategy;
    }

    public ServiceEnvironmentStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceEnvironmentStrategy(ServiceEnvironmentStrategy source) {
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.MaxStrategy != null) {
            this.MaxStrategy = new Long(source.MaxStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "MaxStrategy", this.MaxStrategy);

    }
}

