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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForbidMediaDistributionRequest extends AbstractModel{

    /**
    * 媒体文件列表，每次最多可提交 20 条。
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * forbid：禁播，recover：解禁。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 媒体文件列表，每次最多可提交 20 条。 
     * @return FileIds 媒体文件列表，每次最多可提交 20 条。
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 媒体文件列表，每次最多可提交 20 条。
     * @param FileIds 媒体文件列表，每次最多可提交 20 条。
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get forbid：禁播，recover：解禁。 
     * @return Operation forbid：禁播，recover：解禁。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set forbid：禁播，recover：解禁。
     * @param Operation forbid：禁播，recover：解禁。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID 。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

