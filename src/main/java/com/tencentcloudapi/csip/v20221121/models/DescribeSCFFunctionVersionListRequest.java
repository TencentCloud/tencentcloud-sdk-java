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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSCFFunctionVersionListRequest extends AbstractModel {

    /**
    * 云函数所在地域
参数格式：腾讯云标准 Region，如 ap-guangzhou
    */
    @SerializedName("SCFRegion")
    @Expose
    private String SCFRegion;

    /**
    * 命名空间名称
取值参考：通过 DescribeSCFNamespaceList 接口获取
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数名称
取值参考：通过 DescribeSCFFunctionList 接口获取
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 单页条数
取值范围：[1, 100]
默认值：20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
取值范围：[0, +∞)
默认值：0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 云函数所在地域
参数格式：腾讯云标准 Region，如 ap-guangzhou 
     * @return SCFRegion 云函数所在地域
参数格式：腾讯云标准 Region，如 ap-guangzhou
     */
    public String getSCFRegion() {
        return this.SCFRegion;
    }

    /**
     * Set 云函数所在地域
参数格式：腾讯云标准 Region，如 ap-guangzhou
     * @param SCFRegion 云函数所在地域
参数格式：腾讯云标准 Region，如 ap-guangzhou
     */
    public void setSCFRegion(String SCFRegion) {
        this.SCFRegion = SCFRegion;
    }

    /**
     * Get 命名空间名称
取值参考：通过 DescribeSCFNamespaceList 接口获取 
     * @return Namespace 命名空间名称
取值参考：通过 DescribeSCFNamespaceList 接口获取
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名称
取值参考：通过 DescribeSCFNamespaceList 接口获取
     * @param Namespace 命名空间名称
取值参考：通过 DescribeSCFNamespaceList 接口获取
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 函数名称
取值参考：通过 DescribeSCFFunctionList 接口获取 
     * @return FunctionName 函数名称
取值参考：通过 DescribeSCFFunctionList 接口获取
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名称
取值参考：通过 DescribeSCFFunctionList 接口获取
     * @param FunctionName 函数名称
取值参考：通过 DescribeSCFFunctionList 接口获取
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 单页条数
取值范围：[1, 100]
默认值：20 
     * @return Limit 单页条数
取值范围：[1, 100]
默认值：20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页条数
取值范围：[1, 100]
默认值：20
     * @param Limit 单页条数
取值范围：[1, 100]
默认值：20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量
取值范围：[0, +∞)
默认值：0 
     * @return Offset 分页偏移量
取值范围：[0, +∞)
默认值：0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
取值范围：[0, +∞)
默认值：0
     * @param Offset 分页偏移量
取值范围：[0, +∞)
默认值：0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSCFFunctionVersionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSCFFunctionVersionListRequest(DescribeSCFFunctionVersionListRequest source) {
        if (source.SCFRegion != null) {
            this.SCFRegion = new String(source.SCFRegion);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SCFRegion", this.SCFRegion);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

