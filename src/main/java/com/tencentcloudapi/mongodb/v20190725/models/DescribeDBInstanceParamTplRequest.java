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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceParamTplRequest extends AbstractModel {

    /**
    * 参数模板 ID。请通过接口 [DescribeDBInstanceParamTpl](https://cloud.tencent.com/document/product/240/109155) 获取模板 ID。
    */
    @SerializedName("TplIds")
    @Expose
    private String [] TplIds;

    /**
    * 指定查询的模板名称。
    */
    @SerializedName("TplNames")
    @Expose
    private String [] TplNames;

    /**
    * 指定所需查询的参数模板的数据库版本号。具体支持的版本信息，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。
    */
    @SerializedName("MongoVersion")
    @Expose
    private String [] MongoVersion;

    /**
    * 指定查询的模板类型。
- DEFAULT：系统默认模板。
- CUSTOMIZE：自定义模板。
    */
    @SerializedName("TplType")
    @Expose
    private String TplType;

    /**
     * Get 参数模板 ID。请通过接口 [DescribeDBInstanceParamTpl](https://cloud.tencent.com/document/product/240/109155) 获取模板 ID。 
     * @return TplIds 参数模板 ID。请通过接口 [DescribeDBInstanceParamTpl](https://cloud.tencent.com/document/product/240/109155) 获取模板 ID。
     */
    public String [] getTplIds() {
        return this.TplIds;
    }

    /**
     * Set 参数模板 ID。请通过接口 [DescribeDBInstanceParamTpl](https://cloud.tencent.com/document/product/240/109155) 获取模板 ID。
     * @param TplIds 参数模板 ID。请通过接口 [DescribeDBInstanceParamTpl](https://cloud.tencent.com/document/product/240/109155) 获取模板 ID。
     */
    public void setTplIds(String [] TplIds) {
        this.TplIds = TplIds;
    }

    /**
     * Get 指定查询的模板名称。 
     * @return TplNames 指定查询的模板名称。
     */
    public String [] getTplNames() {
        return this.TplNames;
    }

    /**
     * Set 指定查询的模板名称。
     * @param TplNames 指定查询的模板名称。
     */
    public void setTplNames(String [] TplNames) {
        this.TplNames = TplNames;
    }

    /**
     * Get 指定所需查询的参数模板的数据库版本号。具体支持的版本信息，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。 
     * @return MongoVersion 指定所需查询的参数模板的数据库版本号。具体支持的版本信息，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。
     */
    public String [] getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set 指定所需查询的参数模板的数据库版本号。具体支持的版本信息，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。
     * @param MongoVersion 指定所需查询的参数模板的数据库版本号。具体支持的版本信息，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本，
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
- MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。
     */
    public void setMongoVersion(String [] MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get 指定查询的模板类型。
- DEFAULT：系统默认模板。
- CUSTOMIZE：自定义模板。 
     * @return TplType 指定查询的模板类型。
- DEFAULT：系统默认模板。
- CUSTOMIZE：自定义模板。
     */
    public String getTplType() {
        return this.TplType;
    }

    /**
     * Set 指定查询的模板类型。
- DEFAULT：系统默认模板。
- CUSTOMIZE：自定义模板。
     * @param TplType 指定查询的模板类型。
- DEFAULT：系统默认模板。
- CUSTOMIZE：自定义模板。
     */
    public void setTplType(String TplType) {
        this.TplType = TplType;
    }

    public DescribeDBInstanceParamTplRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceParamTplRequest(DescribeDBInstanceParamTplRequest source) {
        if (source.TplIds != null) {
            this.TplIds = new String[source.TplIds.length];
            for (int i = 0; i < source.TplIds.length; i++) {
                this.TplIds[i] = new String(source.TplIds[i]);
            }
        }
        if (source.TplNames != null) {
            this.TplNames = new String[source.TplNames.length];
            for (int i = 0; i < source.TplNames.length; i++) {
                this.TplNames[i] = new String(source.TplNames[i]);
            }
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String[source.MongoVersion.length];
            for (int i = 0; i < source.MongoVersion.length; i++) {
                this.MongoVersion[i] = new String(source.MongoVersion[i]);
            }
        }
        if (source.TplType != null) {
            this.TplType = new String(source.TplType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TplIds.", this.TplIds);
        this.setParamArraySimple(map, prefix + "TplNames.", this.TplNames);
        this.setParamArraySimple(map, prefix + "MongoVersion.", this.MongoVersion);
        this.setParamSimple(map, prefix + "TplType", this.TplType);

    }
}

