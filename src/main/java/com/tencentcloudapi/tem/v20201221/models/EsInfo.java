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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EsInfo extends AbstractModel{

    /**
    * 最小实例数
    */
    @SerializedName("MinAliveInstances")
    @Expose
    private Long MinAliveInstances;

    /**
    * 最大实例数
    */
    @SerializedName("MaxAliveInstances")
    @Expose
    private Long MaxAliveInstances;

    /**
    * 弹性策略,1:cpu，2:内存
    */
    @SerializedName("EsStrategy")
    @Expose
    private Long EsStrategy;

    /**
    * 弹性扩缩容条件值
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 版本Id
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
     * Get 最小实例数 
     * @return MinAliveInstances 最小实例数
     */
    public Long getMinAliveInstances() {
        return this.MinAliveInstances;
    }

    /**
     * Set 最小实例数
     * @param MinAliveInstances 最小实例数
     */
    public void setMinAliveInstances(Long MinAliveInstances) {
        this.MinAliveInstances = MinAliveInstances;
    }

    /**
     * Get 最大实例数 
     * @return MaxAliveInstances 最大实例数
     */
    public Long getMaxAliveInstances() {
        return this.MaxAliveInstances;
    }

    /**
     * Set 最大实例数
     * @param MaxAliveInstances 最大实例数
     */
    public void setMaxAliveInstances(Long MaxAliveInstances) {
        this.MaxAliveInstances = MaxAliveInstances;
    }

    /**
     * Get 弹性策略,1:cpu，2:内存 
     * @return EsStrategy 弹性策略,1:cpu，2:内存
     */
    public Long getEsStrategy() {
        return this.EsStrategy;
    }

    /**
     * Set 弹性策略,1:cpu，2:内存
     * @param EsStrategy 弹性策略,1:cpu，2:内存
     */
    public void setEsStrategy(Long EsStrategy) {
        this.EsStrategy = EsStrategy;
    }

    /**
     * Get 弹性扩缩容条件值 
     * @return Threshold 弹性扩缩容条件值
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 弹性扩缩容条件值
     * @param Threshold 弹性扩缩容条件值
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 版本Id 
     * @return VersionId 版本Id
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本Id
     * @param VersionId 版本Id
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    public EsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsInfo(EsInfo source) {
        if (source.MinAliveInstances != null) {
            this.MinAliveInstances = new Long(source.MinAliveInstances);
        }
        if (source.MaxAliveInstances != null) {
            this.MaxAliveInstances = new Long(source.MaxAliveInstances);
        }
        if (source.EsStrategy != null) {
            this.EsStrategy = new Long(source.EsStrategy);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinAliveInstances", this.MinAliveInstances);
        this.setParamSimple(map, prefix + "MaxAliveInstances", this.MaxAliveInstances);
        this.setParamSimple(map, prefix + "EsStrategy", this.EsStrategy);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);

    }
}

