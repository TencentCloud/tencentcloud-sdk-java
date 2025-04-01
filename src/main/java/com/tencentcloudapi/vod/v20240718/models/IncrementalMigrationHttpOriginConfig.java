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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationHttpOriginConfig extends AbstractModel {

    /**
    * 回源源站信息。
    */
    @SerializedName("OriginInfo")
    @Expose
    private IncrementalMigrationHttpOriginInfo OriginInfo;

    /**
    * 回源参数。
    */
    @SerializedName("OriginParameter")
    @Expose
    private IncrementalMigrationHttpOriginParameter OriginParameter;

    /**
    * 回源模式。取值有：
<li>SYNC：同步回源；</li>
<li>ASYNC：异步回源。</li>若不填，默认取 `SYNC` 同步回源。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 回源条件。
    */
    @SerializedName("OriginCondition")
    @Expose
    private IncrementalMigrationHttpOriginCondition OriginCondition;

    /**
     * Get 回源源站信息。 
     * @return OriginInfo 回源源站信息。
     */
    public IncrementalMigrationHttpOriginInfo getOriginInfo() {
        return this.OriginInfo;
    }

    /**
     * Set 回源源站信息。
     * @param OriginInfo 回源源站信息。
     */
    public void setOriginInfo(IncrementalMigrationHttpOriginInfo OriginInfo) {
        this.OriginInfo = OriginInfo;
    }

    /**
     * Get 回源参数。 
     * @return OriginParameter 回源参数。
     */
    public IncrementalMigrationHttpOriginParameter getOriginParameter() {
        return this.OriginParameter;
    }

    /**
     * Set 回源参数。
     * @param OriginParameter 回源参数。
     */
    public void setOriginParameter(IncrementalMigrationHttpOriginParameter OriginParameter) {
        this.OriginParameter = OriginParameter;
    }

    /**
     * Get 回源模式。取值有：
<li>SYNC：同步回源；</li>
<li>ASYNC：异步回源。</li>若不填，默认取 `SYNC` 同步回源。 
     * @return Mode 回源模式。取值有：
<li>SYNC：同步回源；</li>
<li>ASYNC：异步回源。</li>若不填，默认取 `SYNC` 同步回源。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 回源模式。取值有：
<li>SYNC：同步回源；</li>
<li>ASYNC：异步回源。</li>若不填，默认取 `SYNC` 同步回源。
     * @param Mode 回源模式。取值有：
<li>SYNC：同步回源；</li>
<li>ASYNC：异步回源。</li>若不填，默认取 `SYNC` 同步回源。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 回源条件。 
     * @return OriginCondition 回源条件。
     */
    public IncrementalMigrationHttpOriginCondition getOriginCondition() {
        return this.OriginCondition;
    }

    /**
     * Set 回源条件。
     * @param OriginCondition 回源条件。
     */
    public void setOriginCondition(IncrementalMigrationHttpOriginCondition OriginCondition) {
        this.OriginCondition = OriginCondition;
    }

    public IncrementalMigrationHttpOriginConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationHttpOriginConfig(IncrementalMigrationHttpOriginConfig source) {
        if (source.OriginInfo != null) {
            this.OriginInfo = new IncrementalMigrationHttpOriginInfo(source.OriginInfo);
        }
        if (source.OriginParameter != null) {
            this.OriginParameter = new IncrementalMigrationHttpOriginParameter(source.OriginParameter);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.OriginCondition != null) {
            this.OriginCondition = new IncrementalMigrationHttpOriginCondition(source.OriginCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "OriginInfo.", this.OriginInfo);
        this.setParamObj(map, prefix + "OriginParameter.", this.OriginParameter);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "OriginCondition.", this.OriginCondition);

    }
}

