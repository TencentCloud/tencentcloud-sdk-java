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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Surgery extends AbstractModel {

    /**
    * 手术史
    */
    @SerializedName("SurgeryHistory")
    @Expose
    private SurgeryHistory SurgeryHistory;

    /**
    * 其他信息
    */
    @SerializedName("OtherInfo")
    @Expose
    private OtherInfo OtherInfo;

    /**
    * 数据在原PDF文件中的第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 手术史 
     * @return SurgeryHistory 手术史
     */
    public SurgeryHistory getSurgeryHistory() {
        return this.SurgeryHistory;
    }

    /**
     * Set 手术史
     * @param SurgeryHistory 手术史
     */
    public void setSurgeryHistory(SurgeryHistory SurgeryHistory) {
        this.SurgeryHistory = SurgeryHistory;
    }

    /**
     * Get 其他信息 
     * @return OtherInfo 其他信息
     */
    public OtherInfo getOtherInfo() {
        return this.OtherInfo;
    }

    /**
     * Set 其他信息
     * @param OtherInfo 其他信息
     */
    public void setOtherInfo(OtherInfo OtherInfo) {
        this.OtherInfo = OtherInfo;
    }

    /**
     * Get 数据在原PDF文件中的第几页 
     * @return Page 数据在原PDF文件中的第几页
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 数据在原PDF文件中的第几页
     * @param Page 数据在原PDF文件中的第几页
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    public Surgery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Surgery(Surgery source) {
        if (source.SurgeryHistory != null) {
            this.SurgeryHistory = new SurgeryHistory(source.SurgeryHistory);
        }
        if (source.OtherInfo != null) {
            this.OtherInfo = new OtherInfo(source.OtherInfo);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SurgeryHistory.", this.SurgeryHistory);
        this.setParamObj(map, prefix + "OtherInfo.", this.OtherInfo);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

