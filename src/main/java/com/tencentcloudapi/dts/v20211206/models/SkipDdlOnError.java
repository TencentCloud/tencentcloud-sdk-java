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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkipDdlOnError extends AbstractModel {

    /**
    * <p>按表名跳过，支持精确 &quot;db.tbl&quot;、库通配 &quot;db.*&quot;、表通配 &quot;<em>.tbl&quot;、全通配 &quot;</em>&quot;</p>
    */
    @SerializedName("Tables")
    @Expose
    private String [] Tables;

    /**
    * <p>按 MySQL 错误码（1~65535）跳过</p><p>取值范围：[1, 65535]</p>
    */
    @SerializedName("ErrorCodes")
    @Expose
    private Long [] ErrorCodes;

    /**
     * Get <p>按表名跳过，支持精确 &quot;db.tbl&quot;、库通配 &quot;db.*&quot;、表通配 &quot;<em>.tbl&quot;、全通配 &quot;</em>&quot;</p> 
     * @return Tables <p>按表名跳过，支持精确 &quot;db.tbl&quot;、库通配 &quot;db.*&quot;、表通配 &quot;<em>.tbl&quot;、全通配 &quot;</em>&quot;</p>
     */
    public String [] getTables() {
        return this.Tables;
    }

    /**
     * Set <p>按表名跳过，支持精确 &quot;db.tbl&quot;、库通配 &quot;db.*&quot;、表通配 &quot;<em>.tbl&quot;、全通配 &quot;</em>&quot;</p>
     * @param Tables <p>按表名跳过，支持精确 &quot;db.tbl&quot;、库通配 &quot;db.*&quot;、表通配 &quot;<em>.tbl&quot;、全通配 &quot;</em>&quot;</p>
     */
    public void setTables(String [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Get <p>按 MySQL 错误码（1~65535）跳过</p><p>取值范围：[1, 65535]</p> 
     * @return ErrorCodes <p>按 MySQL 错误码（1~65535）跳过</p><p>取值范围：[1, 65535]</p>
     */
    public Long [] getErrorCodes() {
        return this.ErrorCodes;
    }

    /**
     * Set <p>按 MySQL 错误码（1~65535）跳过</p><p>取值范围：[1, 65535]</p>
     * @param ErrorCodes <p>按 MySQL 错误码（1~65535）跳过</p><p>取值范围：[1, 65535]</p>
     */
    public void setErrorCodes(Long [] ErrorCodes) {
        this.ErrorCodes = ErrorCodes;
    }

    public SkipDdlOnError() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkipDdlOnError(SkipDdlOnError source) {
        if (source.Tables != null) {
            this.Tables = new String[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new String(source.Tables[i]);
            }
        }
        if (source.ErrorCodes != null) {
            this.ErrorCodes = new Long[source.ErrorCodes.length];
            for (int i = 0; i < source.ErrorCodes.length; i++) {
                this.ErrorCodes[i] = new Long(source.ErrorCodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Tables.", this.Tables);
        this.setParamArraySimple(map, prefix + "ErrorCodes.", this.ErrorCodes);

    }
}

