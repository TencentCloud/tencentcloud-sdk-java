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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationSealsRequest extends AbstractModel{

    /**
    * 调用方用户信息，userId 必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 返回最大数量，最大为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0，最大为20000
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询信息类型，为0时不返回授权用户，为1时返回
    */
    @SerializedName("InfoType")
    @Expose
    private Long InfoType;

    /**
    * 印章id（没有输入返回所有）
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
     * Get 调用方用户信息，userId 必填 
     * @return Operator 调用方用户信息，userId 必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填
     * @param Operator 调用方用户信息，userId 必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 返回最大数量，最大为100 
     * @return Limit 返回最大数量，最大为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回最大数量，最大为100
     * @param Limit 返回最大数量，最大为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0，最大为20000 
     * @return Offset 偏移量，默认为0，最大为20000
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0，最大为20000
     * @param Offset 偏移量，默认为0，最大为20000
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询信息类型，为0时不返回授权用户，为1时返回 
     * @return InfoType 查询信息类型，为0时不返回授权用户，为1时返回
     */
    public Long getInfoType() {
        return this.InfoType;
    }

    /**
     * Set 查询信息类型，为0时不返回授权用户，为1时返回
     * @param InfoType 查询信息类型，为0时不返回授权用户，为1时返回
     */
    public void setInfoType(Long InfoType) {
        this.InfoType = InfoType;
    }

    /**
     * Get 印章id（没有输入返回所有） 
     * @return SealId 印章id（没有输入返回所有）
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 印章id（没有输入返回所有）
     * @param SealId 印章id（没有输入返回所有）
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    public DescribeOrganizationSealsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationSealsRequest(DescribeOrganizationSealsRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InfoType != null) {
            this.InfoType = new Long(source.InfoType);
        }
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InfoType", this.InfoType);
        this.setParamSimple(map, prefix + "SealId", this.SealId);

    }
}

