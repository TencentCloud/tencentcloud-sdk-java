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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DbTaskResult extends AbstractModel {

    /**
    * 结果类型。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 结果描述。
    */
    @SerializedName("ResultDescription")
    @Expose
    private String ResultDescription;

    /**
    * 错误信息描述。
    */
    @SerializedName("ErrDescription")
    @Expose
    private ErrDescription ErrDescription;

    /**
    * 资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * database名称。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
     * Get 结果类型。 
     * @return Result 结果类型。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 结果类型。
     * @param Result 结果类型。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 结果描述。 
     * @return ResultDescription 结果描述。
     */
    public String getResultDescription() {
        return this.ResultDescription;
    }

    /**
     * Set 结果描述。
     * @param ResultDescription 结果描述。
     */
    public void setResultDescription(String ResultDescription) {
        this.ResultDescription = ResultDescription;
    }

    /**
     * Get 错误信息描述。 
     * @return ErrDescription 错误信息描述。
     */
    public ErrDescription getErrDescription() {
        return this.ErrDescription;
    }

    /**
     * Set 错误信息描述。
     * @param ErrDescription 错误信息描述。
     */
    public void setErrDescription(ErrDescription ErrDescription) {
        this.ErrDescription = ErrDescription;
    }

    /**
     * Get 资源ID。 
     * @return ResourceId 资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID。
     * @param ResourceId 资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get database名称。 
     * @return DbName database名称。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set database名称。
     * @param DbName database名称。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    public DbTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DbTaskResult(DbTaskResult source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.ResultDescription != null) {
            this.ResultDescription = new String(source.ResultDescription);
        }
        if (source.ErrDescription != null) {
            this.ErrDescription = new ErrDescription(source.ErrDescription);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ResultDescription", this.ResultDescription);
        this.setParamObj(map, prefix + "ErrDescription.", this.ErrDescription);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);

    }
}

