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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBPFakeURLRequest extends AbstractModel{

    /**
    * 保护网址ID
    */
    @SerializedName("ProtectURLId")
    @Expose
    private Long ProtectURLId;

    /**
    * 仿冒网址
    */
    @SerializedName("FakeURL")
    @Expose
    private String FakeURL;

    /**
    * 截图
    */
    @SerializedName("SnapshotNames")
    @Expose
    private String [] SnapshotNames;

    /**
    * 举报说明
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
     * Get 保护网址ID 
     * @return ProtectURLId 保护网址ID
     */
    public Long getProtectURLId() {
        return this.ProtectURLId;
    }

    /**
     * Set 保护网址ID
     * @param ProtectURLId 保护网址ID
     */
    public void setProtectURLId(Long ProtectURLId) {
        this.ProtectURLId = ProtectURLId;
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
     * Get 截图 
     * @return SnapshotNames 截图
     */
    public String [] getSnapshotNames() {
        return this.SnapshotNames;
    }

    /**
     * Set 截图
     * @param SnapshotNames 截图
     */
    public void setSnapshotNames(String [] SnapshotNames) {
        this.SnapshotNames = SnapshotNames;
    }

    /**
     * Get 举报说明 
     * @return Note 举报说明
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 举报说明
     * @param Note 举报说明
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
        if (source.ProtectURLId != null) {
            this.ProtectURLId = new Long(source.ProtectURLId);
        }
        if (source.FakeURL != null) {
            this.FakeURL = new String(source.FakeURL);
        }
        if (source.SnapshotNames != null) {
            this.SnapshotNames = new String[source.SnapshotNames.length];
            for (int i = 0; i < source.SnapshotNames.length; i++) {
                this.SnapshotNames[i] = new String(source.SnapshotNames[i]);
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
        this.setParamSimple(map, prefix + "ProtectURLId", this.ProtectURLId);
        this.setParamSimple(map, prefix + "FakeURL", this.FakeURL);
        this.setParamArraySimple(map, prefix + "SnapshotNames.", this.SnapshotNames);
        this.setParamSimple(map, prefix + "Note", this.Note);

    }
}

