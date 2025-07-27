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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSSLConfigRequest extends AbstractModel {

    /**
    * 实例 ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 开启或关闭SSL。true - 开启 ；false - 关闭。
    */
    @SerializedName("SSLEnabled")
    @Expose
    private Boolean SSLEnabled;

    /**
    * SSL证书保护的唯一连接地址，若为主实例，可设置为内外网IP地址；若为只读实例，可设置为实例IP或只读组IP。在开启SSL或修改SSL保护的连接地址时，该参数为必传项；在关闭SSL时，该参数将被忽略。
    */
    @SerializedName("ConnectAddress")
    @Expose
    private String ConnectAddress;

    /**
     * Get 实例 ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取 
     * @return DBInstanceId 实例 ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例 ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     * @param DBInstanceId 实例 ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 开启或关闭SSL。true - 开启 ；false - 关闭。 
     * @return SSLEnabled 开启或关闭SSL。true - 开启 ；false - 关闭。
     */
    public Boolean getSSLEnabled() {
        return this.SSLEnabled;
    }

    /**
     * Set 开启或关闭SSL。true - 开启 ；false - 关闭。
     * @param SSLEnabled 开启或关闭SSL。true - 开启 ；false - 关闭。
     */
    public void setSSLEnabled(Boolean SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
    }

    /**
     * Get SSL证书保护的唯一连接地址，若为主实例，可设置为内外网IP地址；若为只读实例，可设置为实例IP或只读组IP。在开启SSL或修改SSL保护的连接地址时，该参数为必传项；在关闭SSL时，该参数将被忽略。 
     * @return ConnectAddress SSL证书保护的唯一连接地址，若为主实例，可设置为内外网IP地址；若为只读实例，可设置为实例IP或只读组IP。在开启SSL或修改SSL保护的连接地址时，该参数为必传项；在关闭SSL时，该参数将被忽略。
     */
    public String getConnectAddress() {
        return this.ConnectAddress;
    }

    /**
     * Set SSL证书保护的唯一连接地址，若为主实例，可设置为内外网IP地址；若为只读实例，可设置为实例IP或只读组IP。在开启SSL或修改SSL保护的连接地址时，该参数为必传项；在关闭SSL时，该参数将被忽略。
     * @param ConnectAddress SSL证书保护的唯一连接地址，若为主实例，可设置为内外网IP地址；若为只读实例，可设置为实例IP或只读组IP。在开启SSL或修改SSL保护的连接地址时，该参数为必传项；在关闭SSL时，该参数将被忽略。
     */
    public void setConnectAddress(String ConnectAddress) {
        this.ConnectAddress = ConnectAddress;
    }

    public ModifyDBInstanceSSLConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSSLConfigRequest(ModifyDBInstanceSSLConfigRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.SSLEnabled != null) {
            this.SSLEnabled = new Boolean(source.SSLEnabled);
        }
        if (source.ConnectAddress != null) {
            this.ConnectAddress = new String(source.ConnectAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "SSLEnabled", this.SSLEnabled);
        this.setParamSimple(map, prefix + "ConnectAddress", this.ConnectAddress);

    }
}

