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

public class EdgeKVPutRequest extends AbstractModel {

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
    * 键名，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 键值。不能为空，最大支持 1 MB。支持存储字符串数据。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 过期时间，绝对时间。表示从 1970 年 1 月 1 日（UTC/GMT 的午夜）开始所经过的秒数，不能小于当前时间。若 Expiration 和 ExpirationTTL 都填写，以 ExpirationTTL 为准。若 Expiration 和 ExpirationTTL 都不填写，则该键值对永不过期。
    */
    @SerializedName("Expiration")
    @Expose
    private Long Expiration;

    /**
    * 过期时间，相对时间，单位为秒。表示数据将在指定秒数后过期，必须大于 0。若 Expiration 和 ExpirationTTL 都填写，以 ExpirationTTL 为准。若 Expiration 和 ExpirationTTL 都不填写，则该键值对永不过期。
    */
    @SerializedName("ExpirationTTL")
    @Expose
    private Long ExpirationTTL;

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
     * Get 键名，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。 
     * @return Key 键名，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 键名，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。
     * @param Key 键名，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 键值。不能为空，最大支持 1 MB。支持存储字符串数据。 
     * @return Value 键值。不能为空，最大支持 1 MB。支持存储字符串数据。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 键值。不能为空，最大支持 1 MB。支持存储字符串数据。
     * @param Value 键值。不能为空，最大支持 1 MB。支持存储字符串数据。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 过期时间，绝对时间。表示从 1970 年 1 月 1 日（UTC/GMT 的午夜）开始所经过的秒数，不能小于当前时间。若 Expiration 和 ExpirationTTL 都填写，以 ExpirationTTL 为准。若 Expiration 和 ExpirationTTL 都不填写，则该键值对永不过期。 
     * @return Expiration 过期时间，绝对时间。表示从 1970 年 1 月 1 日（UTC/GMT 的午夜）开始所经过的秒数，不能小于当前时间。若 Expiration 和 ExpirationTTL 都填写，以 ExpirationTTL 为准。若 Expiration 和 ExpirationTTL 都不填写，则该键值对永不过期。
     */
    public Long getExpiration() {
        return this.Expiration;
    }

    /**
     * Set 过期时间，绝对时间。表示从 1970 年 1 月 1 日（UTC/GMT 的午夜）开始所经过的秒数，不能小于当前时间。若 Expiration 和 ExpirationTTL 都填写，以 ExpirationTTL 为准。若 Expiration 和 ExpirationTTL 都不填写，则该键值对永不过期。
     * @param Expiration 过期时间，绝对时间。表示从 1970 年 1 月 1 日（UTC/GMT 的午夜）开始所经过的秒数，不能小于当前时间。若 Expiration 和 ExpirationTTL 都填写，以 ExpirationTTL 为准。若 Expiration 和 ExpirationTTL 都不填写，则该键值对永不过期。
     */
    public void setExpiration(Long Expiration) {
        this.Expiration = Expiration;
    }

    /**
     * Get 过期时间，相对时间，单位为秒。表示数据将在指定秒数后过期，必须大于 0。若 Expiration 和 ExpirationTTL 都填写，以 ExpirationTTL 为准。若 Expiration 和 ExpirationTTL 都不填写，则该键值对永不过期。 
     * @return ExpirationTTL 过期时间，相对时间，单位为秒。表示数据将在指定秒数后过期，必须大于 0。若 Expiration 和 ExpirationTTL 都填写，以 ExpirationTTL 为准。若 Expiration 和 ExpirationTTL 都不填写，则该键值对永不过期。
     */
    public Long getExpirationTTL() {
        return this.ExpirationTTL;
    }

    /**
     * Set 过期时间，相对时间，单位为秒。表示数据将在指定秒数后过期，必须大于 0。若 Expiration 和 ExpirationTTL 都填写，以 ExpirationTTL 为准。若 Expiration 和 ExpirationTTL 都不填写，则该键值对永不过期。
     * @param ExpirationTTL 过期时间，相对时间，单位为秒。表示数据将在指定秒数后过期，必须大于 0。若 Expiration 和 ExpirationTTL 都填写，以 ExpirationTTL 为准。若 Expiration 和 ExpirationTTL 都不填写，则该键值对永不过期。
     */
    public void setExpirationTTL(Long ExpirationTTL) {
        this.ExpirationTTL = ExpirationTTL;
    }

    public EdgeKVPutRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeKVPutRequest(EdgeKVPutRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Expiration != null) {
            this.Expiration = new Long(source.Expiration);
        }
        if (source.ExpirationTTL != null) {
            this.ExpirationTTL = new Long(source.ExpirationTTL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamSimple(map, prefix + "ExpirationTTL", this.ExpirationTTL);

    }
}

