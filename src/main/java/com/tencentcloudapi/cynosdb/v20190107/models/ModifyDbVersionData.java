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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDbVersionData extends AbstractModel {

    /**
    * <p>修改前版本</p>
    */
    @SerializedName("OldVersion")
    @Expose
    private String OldVersion;

    /**
    * <p>修改后版本</p>
    */
    @SerializedName("NewVersion")
    @Expose
    private String NewVersion;

    /**
    * <p>升级方式</p>
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
     * Get <p>修改前版本</p> 
     * @return OldVersion <p>修改前版本</p>
     */
    public String getOldVersion() {
        return this.OldVersion;
    }

    /**
     * Set <p>修改前版本</p>
     * @param OldVersion <p>修改前版本</p>
     */
    public void setOldVersion(String OldVersion) {
        this.OldVersion = OldVersion;
    }

    /**
     * Get <p>修改后版本</p> 
     * @return NewVersion <p>修改后版本</p>
     */
    public String getNewVersion() {
        return this.NewVersion;
    }

    /**
     * Set <p>修改后版本</p>
     * @param NewVersion <p>修改后版本</p>
     */
    public void setNewVersion(String NewVersion) {
        this.NewVersion = NewVersion;
    }

    /**
     * Get <p>升级方式</p> 
     * @return UpgradeType <p>升级方式</p>
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set <p>升级方式</p>
     * @param UpgradeType <p>升级方式</p>
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    public ModifyDbVersionData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDbVersionData(ModifyDbVersionData source) {
        if (source.OldVersion != null) {
            this.OldVersion = new String(source.OldVersion);
        }
        if (source.NewVersion != null) {
            this.NewVersion = new String(source.NewVersion);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldVersion", this.OldVersion);
        this.setParamSimple(map, prefix + "NewVersion", this.NewVersion);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);

    }
}

