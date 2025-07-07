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

public class IncrementalMigrationHttpHeaderInfo extends AbstractModel {

    /**
    * Http Header 透传模式。取值有：
<li>FOLLOW_ALL：透传所有头部信息；</li>
<li>FOLLOW_PART：透传部分头部信息；</li>
<li>IGNORE_PART：忽略部分头部信息。</li>参数必填。
    */
    @SerializedName("HeaderFollowMode")
    @Expose
    private String HeaderFollowMode;

    /**
    * 需透传 Header Key 集合，仅当 HeaderFollowMode 取值 `FOLLOW_PART` 时需要填充。
    */
    @SerializedName("FollowHttpHeaderKeySet")
    @Expose
    private String [] FollowHttpHeaderKeySet;

    /**
    * 新增 Header 键值对集合。
    */
    @SerializedName("NewHttpHeaderSet")
    @Expose
    private IncrementalMigrationHttpHeader [] NewHttpHeaderSet;

    /**
     * Get Http Header 透传模式。取值有：
<li>FOLLOW_ALL：透传所有头部信息；</li>
<li>FOLLOW_PART：透传部分头部信息；</li>
<li>IGNORE_PART：忽略部分头部信息。</li>参数必填。 
     * @return HeaderFollowMode Http Header 透传模式。取值有：
<li>FOLLOW_ALL：透传所有头部信息；</li>
<li>FOLLOW_PART：透传部分头部信息；</li>
<li>IGNORE_PART：忽略部分头部信息。</li>参数必填。
     */
    public String getHeaderFollowMode() {
        return this.HeaderFollowMode;
    }

    /**
     * Set Http Header 透传模式。取值有：
<li>FOLLOW_ALL：透传所有头部信息；</li>
<li>FOLLOW_PART：透传部分头部信息；</li>
<li>IGNORE_PART：忽略部分头部信息。</li>参数必填。
     * @param HeaderFollowMode Http Header 透传模式。取值有：
<li>FOLLOW_ALL：透传所有头部信息；</li>
<li>FOLLOW_PART：透传部分头部信息；</li>
<li>IGNORE_PART：忽略部分头部信息。</li>参数必填。
     */
    public void setHeaderFollowMode(String HeaderFollowMode) {
        this.HeaderFollowMode = HeaderFollowMode;
    }

    /**
     * Get 需透传 Header Key 集合，仅当 HeaderFollowMode 取值 `FOLLOW_PART` 时需要填充。 
     * @return FollowHttpHeaderKeySet 需透传 Header Key 集合，仅当 HeaderFollowMode 取值 `FOLLOW_PART` 时需要填充。
     */
    public String [] getFollowHttpHeaderKeySet() {
        return this.FollowHttpHeaderKeySet;
    }

    /**
     * Set 需透传 Header Key 集合，仅当 HeaderFollowMode 取值 `FOLLOW_PART` 时需要填充。
     * @param FollowHttpHeaderKeySet 需透传 Header Key 集合，仅当 HeaderFollowMode 取值 `FOLLOW_PART` 时需要填充。
     */
    public void setFollowHttpHeaderKeySet(String [] FollowHttpHeaderKeySet) {
        this.FollowHttpHeaderKeySet = FollowHttpHeaderKeySet;
    }

    /**
     * Get 新增 Header 键值对集合。 
     * @return NewHttpHeaderSet 新增 Header 键值对集合。
     */
    public IncrementalMigrationHttpHeader [] getNewHttpHeaderSet() {
        return this.NewHttpHeaderSet;
    }

    /**
     * Set 新增 Header 键值对集合。
     * @param NewHttpHeaderSet 新增 Header 键值对集合。
     */
    public void setNewHttpHeaderSet(IncrementalMigrationHttpHeader [] NewHttpHeaderSet) {
        this.NewHttpHeaderSet = NewHttpHeaderSet;
    }

    public IncrementalMigrationHttpHeaderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationHttpHeaderInfo(IncrementalMigrationHttpHeaderInfo source) {
        if (source.HeaderFollowMode != null) {
            this.HeaderFollowMode = new String(source.HeaderFollowMode);
        }
        if (source.FollowHttpHeaderKeySet != null) {
            this.FollowHttpHeaderKeySet = new String[source.FollowHttpHeaderKeySet.length];
            for (int i = 0; i < source.FollowHttpHeaderKeySet.length; i++) {
                this.FollowHttpHeaderKeySet[i] = new String(source.FollowHttpHeaderKeySet[i]);
            }
        }
        if (source.NewHttpHeaderSet != null) {
            this.NewHttpHeaderSet = new IncrementalMigrationHttpHeader[source.NewHttpHeaderSet.length];
            for (int i = 0; i < source.NewHttpHeaderSet.length; i++) {
                this.NewHttpHeaderSet[i] = new IncrementalMigrationHttpHeader(source.NewHttpHeaderSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeaderFollowMode", this.HeaderFollowMode);
        this.setParamArraySimple(map, prefix + "FollowHttpHeaderKeySet.", this.FollowHttpHeaderKeySet);
        this.setParamArrayObj(map, prefix + "NewHttpHeaderSet.", this.NewHttpHeaderSet);

    }
}

