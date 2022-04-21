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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSqlTemplateResponse extends AbstractModel{

    /**
    * 数据库名。
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * SQL语句。
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * SQL类型。
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * SQL模版内容。
    */
    @SerializedName("SqlTemplate")
    @Expose
    private String SqlTemplate;

    /**
    * SQL模版ID。
    */
    @SerializedName("SqlId")
    @Expose
    private Long SqlId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据库名。 
     * @return Schema 数据库名。
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set 数据库名。
     * @param Schema 数据库名。
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get SQL语句。 
     * @return SqlText SQL语句。
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set SQL语句。
     * @param SqlText SQL语句。
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get SQL类型。 
     * @return SqlType SQL类型。
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set SQL类型。
     * @param SqlType SQL类型。
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get SQL模版内容。 
     * @return SqlTemplate SQL模版内容。
     */
    public String getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set SQL模版内容。
     * @param SqlTemplate SQL模版内容。
     */
    public void setSqlTemplate(String SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * Get SQL模版ID。 
     * @return SqlId SQL模版ID。
     */
    public Long getSqlId() {
        return this.SqlId;
    }

    /**
     * Set SQL模版ID。
     * @param SqlId SQL模版ID。
     */
    public void setSqlId(Long SqlId) {
        this.SqlId = SqlId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSqlTemplateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSqlTemplateResponse(DescribeSqlTemplateResponse source) {
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.SqlTemplate != null) {
            this.SqlTemplate = new String(source.SqlTemplate);
        }
        if (source.SqlId != null) {
            this.SqlId = new Long(source.SqlId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "SqlTemplate", this.SqlTemplate);
        this.setParamSimple(map, prefix + "SqlId", this.SqlId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

