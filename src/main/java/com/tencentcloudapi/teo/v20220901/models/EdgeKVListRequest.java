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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeKVListRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 命名空间名称。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 键名前缀过滤。只返回以指定前缀开头的键名，长度为 1-512 个字符。不填写表示返回所有键名；不允许传入空字符串。
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * 游标位置。标识当前查询的起始位置，用于遍历大量数据。首次查询时不填写，从头开始遍历；后续查询时填写上一次返回的 Cursor 值，从该位置继续向后遍历。

    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * 返回的键名数量。默认值：20，最大值：1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 命名空间名称。 
     * @return Namespace 命名空间名称。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名称。
     * @param Namespace 命名空间名称。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 键名前缀过滤。只返回以指定前缀开头的键名，长度为 1-512 个字符。不填写表示返回所有键名；不允许传入空字符串。 
     * @return Prefix 键名前缀过滤。只返回以指定前缀开头的键名，长度为 1-512 个字符。不填写表示返回所有键名；不允许传入空字符串。
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set 键名前缀过滤。只返回以指定前缀开头的键名，长度为 1-512 个字符。不填写表示返回所有键名；不允许传入空字符串。
     * @param Prefix 键名前缀过滤。只返回以指定前缀开头的键名，长度为 1-512 个字符。不填写表示返回所有键名；不允许传入空字符串。
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get 游标位置。标识当前查询的起始位置，用于遍历大量数据。首次查询时不填写，从头开始遍历；后续查询时填写上一次返回的 Cursor 值，从该位置继续向后遍历。
 
     * @return Cursor 游标位置。标识当前查询的起始位置，用于遍历大量数据。首次查询时不填写，从头开始遍历；后续查询时填写上一次返回的 Cursor 值，从该位置继续向后遍历。

     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set 游标位置。标识当前查询的起始位置，用于遍历大量数据。首次查询时不填写，从头开始遍历；后续查询时填写上一次返回的 Cursor 值，从该位置继续向后遍历。

     * @param Cursor 游标位置。标识当前查询的起始位置，用于遍历大量数据。首次查询时不填写，从头开始遍历；后续查询时填写上一次返回的 Cursor 值，从该位置继续向后遍历。

     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get 返回的键名数量。默认值：20，最大值：1000。 
     * @return Limit 返回的键名数量。默认值：20，最大值：1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回的键名数量。默认值：20，最大值：1000。
     * @param Limit 返回的键名数量。默认值：20，最大值：1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public EdgeKVListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeKVListRequest(EdgeKVListRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

