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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyConnectionConfigRequest extends AbstractModel{

    /**
    * 实例 ID，如：kee-6ubh****。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 单分片附加带宽，取值范围[0,512]，单位：MB。
<ul><li>开启副本只读时，实例总带宽  = 单分片附加带宽 * 分片数 + 标准带宽 * 分片数 * Max ([只读副本数量, 1])，标准架构的分片数 = 1。</li><li>没有开启副本只读时，实例总带宽 = 单分片附加带宽 * 分片数 + 标准带宽 * 分片数，标准架构的分片数 = 1。</li></ul>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 单分片的总连接数。
<ul>默认为10000，整个实例的最大连接数为单个分片的最大连接数 x 分片数量。标准架构分片数量为1。
<li>关闭副本只读：每个分片的最大连接数的取值范围为[10000,40000]。</li><li>开启副本只读：每个分片的最大连接数的取值范围为 [10000,10000 x (副本数 + 3)]。</li></ul>
    */
    @SerializedName("ClientLimit")
    @Expose
    private Long ClientLimit;

    /**
     * Get 实例 ID，如：kee-6ubh****。 
     * @return InstanceId 实例 ID，如：kee-6ubh****。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，如：kee-6ubh****。
     * @param InstanceId 实例 ID，如：kee-6ubh****。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 单分片附加带宽，取值范围[0,512]，单位：MB。
<ul><li>开启副本只读时，实例总带宽  = 单分片附加带宽 * 分片数 + 标准带宽 * 分片数 * Max ([只读副本数量, 1])，标准架构的分片数 = 1。</li><li>没有开启副本只读时，实例总带宽 = 单分片附加带宽 * 分片数 + 标准带宽 * 分片数，标准架构的分片数 = 1。</li></ul> 
     * @return Bandwidth 单分片附加带宽，取值范围[0,512]，单位：MB。
<ul><li>开启副本只读时，实例总带宽  = 单分片附加带宽 * 分片数 + 标准带宽 * 分片数 * Max ([只读副本数量, 1])，标准架构的分片数 = 1。</li><li>没有开启副本只读时，实例总带宽 = 单分片附加带宽 * 分片数 + 标准带宽 * 分片数，标准架构的分片数 = 1。</li></ul>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 单分片附加带宽，取值范围[0,512]，单位：MB。
<ul><li>开启副本只读时，实例总带宽  = 单分片附加带宽 * 分片数 + 标准带宽 * 分片数 * Max ([只读副本数量, 1])，标准架构的分片数 = 1。</li><li>没有开启副本只读时，实例总带宽 = 单分片附加带宽 * 分片数 + 标准带宽 * 分片数，标准架构的分片数 = 1。</li></ul>
     * @param Bandwidth 单分片附加带宽，取值范围[0,512]，单位：MB。
<ul><li>开启副本只读时，实例总带宽  = 单分片附加带宽 * 分片数 + 标准带宽 * 分片数 * Max ([只读副本数量, 1])，标准架构的分片数 = 1。</li><li>没有开启副本只读时，实例总带宽 = 单分片附加带宽 * 分片数 + 标准带宽 * 分片数，标准架构的分片数 = 1。</li></ul>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 单分片的总连接数。
<ul>默认为10000，整个实例的最大连接数为单个分片的最大连接数 x 分片数量。标准架构分片数量为1。
<li>关闭副本只读：每个分片的最大连接数的取值范围为[10000,40000]。</li><li>开启副本只读：每个分片的最大连接数的取值范围为 [10000,10000 x (副本数 + 3)]。</li></ul> 
     * @return ClientLimit 单分片的总连接数。
<ul>默认为10000，整个实例的最大连接数为单个分片的最大连接数 x 分片数量。标准架构分片数量为1。
<li>关闭副本只读：每个分片的最大连接数的取值范围为[10000,40000]。</li><li>开启副本只读：每个分片的最大连接数的取值范围为 [10000,10000 x (副本数 + 3)]。</li></ul>
     */
    public Long getClientLimit() {
        return this.ClientLimit;
    }

    /**
     * Set 单分片的总连接数。
<ul>默认为10000，整个实例的最大连接数为单个分片的最大连接数 x 分片数量。标准架构分片数量为1。
<li>关闭副本只读：每个分片的最大连接数的取值范围为[10000,40000]。</li><li>开启副本只读：每个分片的最大连接数的取值范围为 [10000,10000 x (副本数 + 3)]。</li></ul>
     * @param ClientLimit 单分片的总连接数。
<ul>默认为10000，整个实例的最大连接数为单个分片的最大连接数 x 分片数量。标准架构分片数量为1。
<li>关闭副本只读：每个分片的最大连接数的取值范围为[10000,40000]。</li><li>开启副本只读：每个分片的最大连接数的取值范围为 [10000,10000 x (副本数 + 3)]。</li></ul>
     */
    public void setClientLimit(Long ClientLimit) {
        this.ClientLimit = ClientLimit;
    }

    public ModifyConnectionConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConnectionConfigRequest(ModifyConnectionConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.ClientLimit != null) {
            this.ClientLimit = new Long(source.ClientLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "ClientLimit", this.ClientLimit);

    }
}

