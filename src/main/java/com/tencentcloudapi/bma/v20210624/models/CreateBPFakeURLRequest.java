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
    * xxx
    */
    @SerializedName("ProtectURLId")
    @Expose
    private Long ProtectURLId;

    /**
    * xxx
    */
    @SerializedName("FakeURL")
    @Expose
    private String FakeURL;

    /**
    * xxx
    */
    @SerializedName("SnapshotNames")
    @Expose
    private String [] SnapshotNames;

    /**
    * xxx
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
     * Get xxx 
     * @return ProtectURLId xxx
     */
    public Long getProtectURLId() {
        return this.ProtectURLId;
    }

    /**
     * Set xxx
     * @param ProtectURLId xxx
     */
    public void setProtectURLId(Long ProtectURLId) {
        this.ProtectURLId = ProtectURLId;
    }

    /**
     * Get xxx 
     * @return FakeURL xxx
     */
    public String getFakeURL() {
        return this.FakeURL;
    }

    /**
     * Set xxx
     * @param FakeURL xxx
     */
    public void setFakeURL(String FakeURL) {
        this.FakeURL = FakeURL;
    }

    /**
     * Get xxx 
     * @return SnapshotNames xxx
     */
    public String [] getSnapshotNames() {
        return this.SnapshotNames;
    }

    /**
     * Set xxx
     * @param SnapshotNames xxx
     */
    public void setSnapshotNames(String [] SnapshotNames) {
        this.SnapshotNames = SnapshotNames;
    }

    /**
     * Get xxx 
     * @return Note xxx
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set xxx
     * @param Note xxx
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

