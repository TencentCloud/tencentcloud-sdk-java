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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationOriginFileInfo extends AbstractModel {

    /**
    * 文件前缀配置。
    */
    @SerializedName("PrefixConfig")
    @Expose
    private IncrementalMigrationOriginPrefixConfig PrefixConfig;

    /**
    * 文件后缀配置。
    */
    @SerializedName("SuffixConfig")
    @Expose
    private IncrementalMigrationOriginSuffixConfig SuffixConfig;

    /**
    * 固定文件配置。
    */
    @SerializedName("FixedFileConfig")
    @Expose
    private IncrementalMigrationOriginFixedFileConfig FixedFileConfig;

    /**
     * Get 文件前缀配置。 
     * @return PrefixConfig 文件前缀配置。
     */
    public IncrementalMigrationOriginPrefixConfig getPrefixConfig() {
        return this.PrefixConfig;
    }

    /**
     * Set 文件前缀配置。
     * @param PrefixConfig 文件前缀配置。
     */
    public void setPrefixConfig(IncrementalMigrationOriginPrefixConfig PrefixConfig) {
        this.PrefixConfig = PrefixConfig;
    }

    /**
     * Get 文件后缀配置。 
     * @return SuffixConfig 文件后缀配置。
     */
    public IncrementalMigrationOriginSuffixConfig getSuffixConfig() {
        return this.SuffixConfig;
    }

    /**
     * Set 文件后缀配置。
     * @param SuffixConfig 文件后缀配置。
     */
    public void setSuffixConfig(IncrementalMigrationOriginSuffixConfig SuffixConfig) {
        this.SuffixConfig = SuffixConfig;
    }

    /**
     * Get 固定文件配置。 
     * @return FixedFileConfig 固定文件配置。
     */
    public IncrementalMigrationOriginFixedFileConfig getFixedFileConfig() {
        return this.FixedFileConfig;
    }

    /**
     * Set 固定文件配置。
     * @param FixedFileConfig 固定文件配置。
     */
    public void setFixedFileConfig(IncrementalMigrationOriginFixedFileConfig FixedFileConfig) {
        this.FixedFileConfig = FixedFileConfig;
    }

    public IncrementalMigrationOriginFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationOriginFileInfo(IncrementalMigrationOriginFileInfo source) {
        if (source.PrefixConfig != null) {
            this.PrefixConfig = new IncrementalMigrationOriginPrefixConfig(source.PrefixConfig);
        }
        if (source.SuffixConfig != null) {
            this.SuffixConfig = new IncrementalMigrationOriginSuffixConfig(source.SuffixConfig);
        }
        if (source.FixedFileConfig != null) {
            this.FixedFileConfig = new IncrementalMigrationOriginFixedFileConfig(source.FixedFileConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PrefixConfig.", this.PrefixConfig);
        this.setParamObj(map, prefix + "SuffixConfig.", this.SuffixConfig);
        this.setParamObj(map, prefix + "FixedFileConfig.", this.FixedFileConfig);

    }
}

