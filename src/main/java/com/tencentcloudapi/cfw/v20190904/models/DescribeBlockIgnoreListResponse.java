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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBlockIgnoreListResponse extends AbstractModel {

    /**
    * 列表数据
    */
    @SerializedName("Data")
    @Expose
    private BlockIgnoreRule [] Data;

    /**
    * 查询结果总数，用于分页
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 状态值，0：查询成功，非0：查询失败
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * 状态信息，success：查询成功，fail：查询失败
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * 安全事件来源下拉框
    */
    @SerializedName("SourceList")
    @Expose
    private String [] SourceList;

    /**
    * 对应规则类型的数量，示例：[0,122,30,55,12,232,0]，封禁0个，IP地址122个，域名30个，威胁情报55个，资产实例12个，自定义策略232个，入侵防御规则0个
    */
    @SerializedName("RuleTypeDataList")
    @Expose
    private Long [] RuleTypeDataList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 列表数据 
     * @return Data 列表数据
     */
    public BlockIgnoreRule [] getData() {
        return this.Data;
    }

    /**
     * Set 列表数据
     * @param Data 列表数据
     */
    public void setData(BlockIgnoreRule [] Data) {
        this.Data = Data;
    }

    /**
     * Get 查询结果总数，用于分页 
     * @return Total 查询结果总数，用于分页
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 查询结果总数，用于分页
     * @param Total 查询结果总数，用于分页
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 状态值，0：查询成功，非0：查询失败 
     * @return ReturnCode 状态值，0：查询成功，非0：查询失败
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 状态值，0：查询成功，非0：查询失败
     * @param ReturnCode 状态值，0：查询成功，非0：查询失败
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 状态信息，success：查询成功，fail：查询失败 
     * @return ReturnMsg 状态信息，success：查询成功，fail：查询失败
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set 状态信息，success：查询成功，fail：查询失败
     * @param ReturnMsg 状态信息，success：查询成功，fail：查询失败
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get 安全事件来源下拉框 
     * @return SourceList 安全事件来源下拉框
     */
    public String [] getSourceList() {
        return this.SourceList;
    }

    /**
     * Set 安全事件来源下拉框
     * @param SourceList 安全事件来源下拉框
     */
    public void setSourceList(String [] SourceList) {
        this.SourceList = SourceList;
    }

    /**
     * Get 对应规则类型的数量，示例：[0,122,30,55,12,232,0]，封禁0个，IP地址122个，域名30个，威胁情报55个，资产实例12个，自定义策略232个，入侵防御规则0个 
     * @return RuleTypeDataList 对应规则类型的数量，示例：[0,122,30,55,12,232,0]，封禁0个，IP地址122个，域名30个，威胁情报55个，资产实例12个，自定义策略232个，入侵防御规则0个
     */
    public Long [] getRuleTypeDataList() {
        return this.RuleTypeDataList;
    }

    /**
     * Set 对应规则类型的数量，示例：[0,122,30,55,12,232,0]，封禁0个，IP地址122个，域名30个，威胁情报55个，资产实例12个，自定义策略232个，入侵防御规则0个
     * @param RuleTypeDataList 对应规则类型的数量，示例：[0,122,30,55,12,232,0]，封禁0个，IP地址122个，域名30个，威胁情报55个，资产实例12个，自定义策略232个，入侵防御规则0个
     */
    public void setRuleTypeDataList(Long [] RuleTypeDataList) {
        this.RuleTypeDataList = RuleTypeDataList;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBlockIgnoreListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlockIgnoreListResponse(DescribeBlockIgnoreListResponse source) {
        if (source.Data != null) {
            this.Data = new BlockIgnoreRule[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new BlockIgnoreRule(source.Data[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.SourceList != null) {
            this.SourceList = new String[source.SourceList.length];
            for (int i = 0; i < source.SourceList.length; i++) {
                this.SourceList[i] = new String(source.SourceList[i]);
            }
        }
        if (source.RuleTypeDataList != null) {
            this.RuleTypeDataList = new Long[source.RuleTypeDataList.length];
            for (int i = 0; i < source.RuleTypeDataList.length; i++) {
                this.RuleTypeDataList[i] = new Long(source.RuleTypeDataList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamArraySimple(map, prefix + "SourceList.", this.SourceList);
        this.setParamArraySimple(map, prefix + "RuleTypeDataList.", this.RuleTypeDataList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

