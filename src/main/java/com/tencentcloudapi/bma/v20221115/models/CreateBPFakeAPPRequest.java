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
package com.tencentcloudapi.bma.v20221115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBPFakeAPPRequest extends AbstractModel{

    /**
    * 企业id
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * 仿冒应用名称
    */
    @SerializedName("FakeAPPName")
    @Expose
    private String FakeAPPName;

    /**
    * 仿冒来源
    */
    @SerializedName("APPChan")
    @Expose
    private String APPChan;

    /**
    * 仿冒应用包名
    */
    @SerializedName("FakeAPPPackageName")
    @Expose
    private String FakeAPPPackageName;

    /**
    * 仿冒应用证书
    */
    @SerializedName("FakeAPPCert")
    @Expose
    private String FakeAPPCert;

    /**
    * 仿冒应用大小
    */
    @SerializedName("FakeAPPSize")
    @Expose
    private String FakeAPPSize;

    /**
    * 仿冒截图
    */
    @SerializedName("FakeAPPSnapshots")
    @Expose
    private String [] FakeAPPSnapshots;

    /**
    * 备注
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
     * Get 企业id 
     * @return CompanyId 企业id
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 企业id
     * @param CompanyId 企业id
     */
    public void setCompanyId(Long CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 仿冒应用名称 
     * @return FakeAPPName 仿冒应用名称
     */
    public String getFakeAPPName() {
        return this.FakeAPPName;
    }

    /**
     * Set 仿冒应用名称
     * @param FakeAPPName 仿冒应用名称
     */
    public void setFakeAPPName(String FakeAPPName) {
        this.FakeAPPName = FakeAPPName;
    }

    /**
     * Get 仿冒来源 
     * @return APPChan 仿冒来源
     */
    public String getAPPChan() {
        return this.APPChan;
    }

    /**
     * Set 仿冒来源
     * @param APPChan 仿冒来源
     */
    public void setAPPChan(String APPChan) {
        this.APPChan = APPChan;
    }

    /**
     * Get 仿冒应用包名 
     * @return FakeAPPPackageName 仿冒应用包名
     */
    public String getFakeAPPPackageName() {
        return this.FakeAPPPackageName;
    }

    /**
     * Set 仿冒应用包名
     * @param FakeAPPPackageName 仿冒应用包名
     */
    public void setFakeAPPPackageName(String FakeAPPPackageName) {
        this.FakeAPPPackageName = FakeAPPPackageName;
    }

    /**
     * Get 仿冒应用证书 
     * @return FakeAPPCert 仿冒应用证书
     */
    public String getFakeAPPCert() {
        return this.FakeAPPCert;
    }

    /**
     * Set 仿冒应用证书
     * @param FakeAPPCert 仿冒应用证书
     */
    public void setFakeAPPCert(String FakeAPPCert) {
        this.FakeAPPCert = FakeAPPCert;
    }

    /**
     * Get 仿冒应用大小 
     * @return FakeAPPSize 仿冒应用大小
     */
    public String getFakeAPPSize() {
        return this.FakeAPPSize;
    }

    /**
     * Set 仿冒应用大小
     * @param FakeAPPSize 仿冒应用大小
     */
    public void setFakeAPPSize(String FakeAPPSize) {
        this.FakeAPPSize = FakeAPPSize;
    }

    /**
     * Get 仿冒截图 
     * @return FakeAPPSnapshots 仿冒截图
     */
    public String [] getFakeAPPSnapshots() {
        return this.FakeAPPSnapshots;
    }

    /**
     * Set 仿冒截图
     * @param FakeAPPSnapshots 仿冒截图
     */
    public void setFakeAPPSnapshots(String [] FakeAPPSnapshots) {
        this.FakeAPPSnapshots = FakeAPPSnapshots;
    }

    /**
     * Get 备注 
     * @return Note 备注
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 备注
     * @param Note 备注
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    public CreateBPFakeAPPRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBPFakeAPPRequest(CreateBPFakeAPPRequest source) {
        if (source.CompanyId != null) {
            this.CompanyId = new Long(source.CompanyId);
        }
        if (source.FakeAPPName != null) {
            this.FakeAPPName = new String(source.FakeAPPName);
        }
        if (source.APPChan != null) {
            this.APPChan = new String(source.APPChan);
        }
        if (source.FakeAPPPackageName != null) {
            this.FakeAPPPackageName = new String(source.FakeAPPPackageName);
        }
        if (source.FakeAPPCert != null) {
            this.FakeAPPCert = new String(source.FakeAPPCert);
        }
        if (source.FakeAPPSize != null) {
            this.FakeAPPSize = new String(source.FakeAPPSize);
        }
        if (source.FakeAPPSnapshots != null) {
            this.FakeAPPSnapshots = new String[source.FakeAPPSnapshots.length];
            for (int i = 0; i < source.FakeAPPSnapshots.length; i++) {
                this.FakeAPPSnapshots[i] = new String(source.FakeAPPSnapshots[i]);
            }
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "FakeAPPName", this.FakeAPPName);
        this.setParamSimple(map, prefix + "APPChan", this.APPChan);
        this.setParamSimple(map, prefix + "FakeAPPPackageName", this.FakeAPPPackageName);
        this.setParamSimple(map, prefix + "FakeAPPCert", this.FakeAPPCert);
        this.setParamSimple(map, prefix + "FakeAPPSize", this.FakeAPPSize);
        this.setParamArraySimple(map, prefix + "FakeAPPSnapshots.", this.FakeAPPSnapshots);
        this.setParamSimple(map, prefix + "Note", this.Note);

    }
}

