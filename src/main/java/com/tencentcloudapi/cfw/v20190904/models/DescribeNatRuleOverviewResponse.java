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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatRuleOverviewResponse extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 弹性IP列表
    */
    @SerializedName("EipList")
    @Expose
    private String [] EipList;

    /**
    * 端口转发规则数量
    */
    @SerializedName("DnatNum")
    @Expose
    private Long DnatNum;

    /**
    * 访问控制规则总数
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 访问控制规则剩余配额
    */
    @SerializedName("RemainNum")
    @Expose
    private Long RemainNum;

    /**
    * 阻断规则条数
    */
    @SerializedName("BlockNum")
    @Expose
    private Long BlockNum;

    /**
    * 启用规则条数
    */
    @SerializedName("EnableNum")
    @Expose
    private Long EnableNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 弹性IP列表 
     * @return EipList 弹性IP列表
     */
    public String [] getEipList() {
        return this.EipList;
    }

    /**
     * Set 弹性IP列表
     * @param EipList 弹性IP列表
     */
    public void setEipList(String [] EipList) {
        this.EipList = EipList;
    }

    /**
     * Get 端口转发规则数量 
     * @return DnatNum 端口转发规则数量
     */
    public Long getDnatNum() {
        return this.DnatNum;
    }

    /**
     * Set 端口转发规则数量
     * @param DnatNum 端口转发规则数量
     */
    public void setDnatNum(Long DnatNum) {
        this.DnatNum = DnatNum;
    }

    /**
     * Get 访问控制规则总数 
     * @return TotalNum 访问控制规则总数
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 访问控制规则总数
     * @param TotalNum 访问控制规则总数
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 访问控制规则剩余配额 
     * @return RemainNum 访问控制规则剩余配额
     */
    public Long getRemainNum() {
        return this.RemainNum;
    }

    /**
     * Set 访问控制规则剩余配额
     * @param RemainNum 访问控制规则剩余配额
     */
    public void setRemainNum(Long RemainNum) {
        this.RemainNum = RemainNum;
    }

    /**
     * Get 阻断规则条数 
     * @return BlockNum 阻断规则条数
     */
    public Long getBlockNum() {
        return this.BlockNum;
    }

    /**
     * Set 阻断规则条数
     * @param BlockNum 阻断规则条数
     */
    public void setBlockNum(Long BlockNum) {
        this.BlockNum = BlockNum;
    }

    /**
     * Get 启用规则条数 
     * @return EnableNum 启用规则条数
     */
    public Long getEnableNum() {
        return this.EnableNum;
    }

    /**
     * Set 启用规则条数
     * @param EnableNum 启用规则条数
     */
    public void setEnableNum(Long EnableNum) {
        this.EnableNum = EnableNum;
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

    public DescribeNatRuleOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatRuleOverviewResponse(DescribeNatRuleOverviewResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.EipList != null) {
            this.EipList = new String[source.EipList.length];
            for (int i = 0; i < source.EipList.length; i++) {
                this.EipList[i] = new String(source.EipList[i]);
            }
        }
        if (source.DnatNum != null) {
            this.DnatNum = new Long(source.DnatNum);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.RemainNum != null) {
            this.RemainNum = new Long(source.RemainNum);
        }
        if (source.BlockNum != null) {
            this.BlockNum = new Long(source.BlockNum);
        }
        if (source.EnableNum != null) {
            this.EnableNum = new Long(source.EnableNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "EipList.", this.EipList);
        this.setParamSimple(map, prefix + "DnatNum", this.DnatNum);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "RemainNum", this.RemainNum);
        this.setParamSimple(map, prefix + "BlockNum", this.BlockNum);
        this.setParamSimple(map, prefix + "EnableNum", this.EnableNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

