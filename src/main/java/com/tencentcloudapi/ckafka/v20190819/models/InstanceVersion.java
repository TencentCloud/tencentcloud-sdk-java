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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceVersion extends AbstractModel {

    /**
    * ckafka集群实例版本
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * broker版本信息
    */
    @SerializedName("CurBrokerVersion")
    @Expose
    private String CurBrokerVersion;

    /**
    * 最新版本信息
    */
    @SerializedName("LatestBrokerVersion")
    @Expose
    private LatestBrokerVersion [] LatestBrokerVersion;

    /**
    * 允许跨大版本内核升级
    */
    @SerializedName("AllowUpgradeHighVersion")
    @Expose
    private Boolean AllowUpgradeHighVersion;

    /**
    * 允许升级的大版本
    */
    @SerializedName("HighVersionSet")
    @Expose
    private String [] HighVersionSet;

    /**
    * 允许小版本号配置自动删除消费者组
    */
    @SerializedName("AllowAutoDeleteTimestamp")
    @Expose
    private Boolean AllowAutoDeleteTimestamp;

    /**
     * Get ckafka集群实例版本 
     * @return KafkaVersion ckafka集群实例版本
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set ckafka集群实例版本
     * @param KafkaVersion ckafka集群实例版本
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get broker版本信息 
     * @return CurBrokerVersion broker版本信息
     */
    public String getCurBrokerVersion() {
        return this.CurBrokerVersion;
    }

    /**
     * Set broker版本信息
     * @param CurBrokerVersion broker版本信息
     */
    public void setCurBrokerVersion(String CurBrokerVersion) {
        this.CurBrokerVersion = CurBrokerVersion;
    }

    /**
     * Get 最新版本信息 
     * @return LatestBrokerVersion 最新版本信息
     */
    public LatestBrokerVersion [] getLatestBrokerVersion() {
        return this.LatestBrokerVersion;
    }

    /**
     * Set 最新版本信息
     * @param LatestBrokerVersion 最新版本信息
     */
    public void setLatestBrokerVersion(LatestBrokerVersion [] LatestBrokerVersion) {
        this.LatestBrokerVersion = LatestBrokerVersion;
    }

    /**
     * Get 允许跨大版本内核升级 
     * @return AllowUpgradeHighVersion 允许跨大版本内核升级
     */
    public Boolean getAllowUpgradeHighVersion() {
        return this.AllowUpgradeHighVersion;
    }

    /**
     * Set 允许跨大版本内核升级
     * @param AllowUpgradeHighVersion 允许跨大版本内核升级
     */
    public void setAllowUpgradeHighVersion(Boolean AllowUpgradeHighVersion) {
        this.AllowUpgradeHighVersion = AllowUpgradeHighVersion;
    }

    /**
     * Get 允许升级的大版本 
     * @return HighVersionSet 允许升级的大版本
     */
    public String [] getHighVersionSet() {
        return this.HighVersionSet;
    }

    /**
     * Set 允许升级的大版本
     * @param HighVersionSet 允许升级的大版本
     */
    public void setHighVersionSet(String [] HighVersionSet) {
        this.HighVersionSet = HighVersionSet;
    }

    /**
     * Get 允许小版本号配置自动删除消费者组 
     * @return AllowAutoDeleteTimestamp 允许小版本号配置自动删除消费者组
     */
    public Boolean getAllowAutoDeleteTimestamp() {
        return this.AllowAutoDeleteTimestamp;
    }

    /**
     * Set 允许小版本号配置自动删除消费者组
     * @param AllowAutoDeleteTimestamp 允许小版本号配置自动删除消费者组
     */
    public void setAllowAutoDeleteTimestamp(Boolean AllowAutoDeleteTimestamp) {
        this.AllowAutoDeleteTimestamp = AllowAutoDeleteTimestamp;
    }

    public InstanceVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceVersion(InstanceVersion source) {
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.CurBrokerVersion != null) {
            this.CurBrokerVersion = new String(source.CurBrokerVersion);
        }
        if (source.LatestBrokerVersion != null) {
            this.LatestBrokerVersion = new LatestBrokerVersion[source.LatestBrokerVersion.length];
            for (int i = 0; i < source.LatestBrokerVersion.length; i++) {
                this.LatestBrokerVersion[i] = new LatestBrokerVersion(source.LatestBrokerVersion[i]);
            }
        }
        if (source.AllowUpgradeHighVersion != null) {
            this.AllowUpgradeHighVersion = new Boolean(source.AllowUpgradeHighVersion);
        }
        if (source.HighVersionSet != null) {
            this.HighVersionSet = new String[source.HighVersionSet.length];
            for (int i = 0; i < source.HighVersionSet.length; i++) {
                this.HighVersionSet[i] = new String(source.HighVersionSet[i]);
            }
        }
        if (source.AllowAutoDeleteTimestamp != null) {
            this.AllowAutoDeleteTimestamp = new Boolean(source.AllowAutoDeleteTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "CurBrokerVersion", this.CurBrokerVersion);
        this.setParamArrayObj(map, prefix + "LatestBrokerVersion.", this.LatestBrokerVersion);
        this.setParamSimple(map, prefix + "AllowUpgradeHighVersion", this.AllowUpgradeHighVersion);
        this.setParamArraySimple(map, prefix + "HighVersionSet.", this.HighVersionSet);
        this.setParamSimple(map, prefix + "AllowAutoDeleteTimestamp", this.AllowAutoDeleteTimestamp);

    }
}

