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

public class CreateBPFakeURLRequest extends AbstractModel{

    /**
    * 企业id
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * 仿冒网址
    */
    @SerializedName("FakeURL")
    @Expose
    private String FakeURL;

    /**
    * 仿冒网址截图
    */
    @SerializedName("FakeURLSnapshots")
    @Expose
    private String [] FakeURLSnapshots;

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
     * Get 仿冒网址 
     * @return FakeURL 仿冒网址
     */
    public String getFakeURL() {
        return this.FakeURL;
    }

    /**
     * Set 仿冒网址
     * @param FakeURL 仿冒网址
     */
    public void setFakeURL(String FakeURL) {
        this.FakeURL = FakeURL;
    }

    /**
     * Get 仿冒网址截图 
     * @return FakeURLSnapshots 仿冒网址截图
     */
    public String [] getFakeURLSnapshots() {
        return this.FakeURLSnapshots;
    }

    /**
     * Set 仿冒网址截图
     * @param FakeURLSnapshots 仿冒网址截图
     */
    public void setFakeURLSnapshots(String [] FakeURLSnapshots) {
        this.FakeURLSnapshots = FakeURLSnapshots;
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

    public CreateBPFakeURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBPFakeURLRequest(CreateBPFakeURLRequest source) {
        if (source.CompanyId != null) {
            this.CompanyId = new Long(source.CompanyId);
        }
        if (source.FakeURL != null) {
            this.FakeURL = new String(source.FakeURL);
        }
        if (source.FakeURLSnapshots != null) {
            this.FakeURLSnapshots = new String[source.FakeURLSnapshots.length];
            for (int i = 0; i < source.FakeURLSnapshots.length; i++) {
                this.FakeURLSnapshots[i] = new String(source.FakeURLSnapshots[i]);
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
        this.setParamSimple(map, prefix + "FakeURL", this.FakeURL);
        this.setParamArraySimple(map, prefix + "FakeURLSnapshots.", this.FakeURLSnapshots);
        this.setParamSimple(map, prefix + "Note", this.Note);

    }
}

