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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceParamTplRequest extends AbstractModel {

    /**
    * 参数模板 ID 查询条件。
    */
    @SerializedName("TplIds")
    @Expose
    private String [] TplIds;

    /**
    * 模板名称，查询条件。
    */
    @SerializedName("TplNames")
    @Expose
    private String [] TplNames;

    /**
    * 根据版本号查询参数模板，具体支持的售卖版本，请参见[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询云数据库的售卖规格的返回结果。参数与版本对应关系如下所示：
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
    */
    @SerializedName("MongoVersion")
    @Expose
    private String [] MongoVersion;

    /**
    * 根据模板类型查询参数模板，支持DEFAULT（默认模板）和CUSTOMIZE（自定义模板）两种。
    */
    @SerializedName("TplType")
    @Expose
    private String TplType;

    /**
     * Get 参数模板 ID 查询条件。 
     * @return TplIds 参数模板 ID 查询条件。
     */
    public String [] getTplIds() {
        return this.TplIds;
    }

    /**
     * Set 参数模板 ID 查询条件。
     * @param TplIds 参数模板 ID 查询条件。
     */
    public void setTplIds(String [] TplIds) {
        this.TplIds = TplIds;
    }

    /**
     * Get 模板名称，查询条件。 
     * @return TplNames 模板名称，查询条件。
     */
    public String [] getTplNames() {
        return this.TplNames;
    }

    /**
     * Set 模板名称，查询条件。
     * @param TplNames 模板名称，查询条件。
     */
    public void setTplNames(String [] TplNames) {
        this.TplNames = TplNames;
    }

    /**
     * Get 根据版本号查询参数模板，具体支持的售卖版本，请参见[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询云数据库的售卖规格的返回结果。参数与版本对应关系如下所示：
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。 
     * @return MongoVersion 根据版本号查询参数模板，具体支持的售卖版本，请参见[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询云数据库的售卖规格的返回结果。参数与版本对应关系如下所示：
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
     */
    public String [] getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set 根据版本号查询参数模板，具体支持的售卖版本，请参见[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询云数据库的售卖规格的返回结果。参数与版本对应关系如下所示：
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
     * @param MongoVersion 根据版本号查询参数模板，具体支持的售卖版本，请参见[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询云数据库的售卖规格的返回结果。参数与版本对应关系如下所示：
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
     */
    public void setMongoVersion(String [] MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get 根据模板类型查询参数模板，支持DEFAULT（默认模板）和CUSTOMIZE（自定义模板）两种。 
     * @return TplType 根据模板类型查询参数模板，支持DEFAULT（默认模板）和CUSTOMIZE（自定义模板）两种。
     */
    public String getTplType() {
        return this.TplType;
    }

    /**
     * Set 根据模板类型查询参数模板，支持DEFAULT（默认模板）和CUSTOMIZE（自定义模板）两种。
     * @param TplType 根据模板类型查询参数模板，支持DEFAULT（默认模板）和CUSTOMIZE（自定义模板）两种。
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

