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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperatorInfo extends AbstractModel {

    /**
    * <p>操作者子账号 UIN</p>
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * <p>操作者子账号名称</p>
    */
    @SerializedName("SubUinName")
    @Expose
    private String SubUinName;

    /**
    * <p>是否为平台操作</p>
    */
    @SerializedName("IsPlatformOperator")
    @Expose
    private Boolean IsPlatformOperator;

    /**
    * <p>操作类型</p>
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
     * Get <p>操作者子账号 UIN</p> 
     * @return SubUin <p>操作者子账号 UIN</p>
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>操作者子账号 UIN</p>
     * @param SubUin <p>操作者子账号 UIN</p>
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get <p>操作者子账号名称</p> 
     * @return SubUinName <p>操作者子账号名称</p>
     */
    public String getSubUinName() {
        return this.SubUinName;
    }

    /**
     * Set <p>操作者子账号名称</p>
     * @param SubUinName <p>操作者子账号名称</p>
     */
    public void setSubUinName(String SubUinName) {
        this.SubUinName = SubUinName;
    }

    /**
     * Get <p>是否为平台操作</p> 
     * @return IsPlatformOperator <p>是否为平台操作</p>
     */
    public Boolean getIsPlatformOperator() {
        return this.IsPlatformOperator;
    }

    /**
     * Set <p>是否为平台操作</p>
     * @param IsPlatformOperator <p>是否为平台操作</p>
     */
    public void setIsPlatformOperator(Boolean IsPlatformOperator) {
        this.IsPlatformOperator = IsPlatformOperator;
    }

    /**
     * Get <p>操作类型</p> 
     * @return OperationType <p>操作类型</p>
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set <p>操作类型</p>
     * @param OperationType <p>操作类型</p>
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    public OperatorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperatorInfo(OperatorInfo source) {
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.SubUinName != null) {
            this.SubUinName = new String(source.SubUinName);
        }
        if (source.IsPlatformOperator != null) {
            this.IsPlatformOperator = new Boolean(source.IsPlatformOperator);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubUinName", this.SubUinName);
        this.setParamSimple(map, prefix + "IsPlatformOperator", this.IsPlatformOperator);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);

    }
}

