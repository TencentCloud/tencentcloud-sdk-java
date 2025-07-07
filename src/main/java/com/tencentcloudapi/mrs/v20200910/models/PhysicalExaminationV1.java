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

public class PhysicalExaminationV1 extends AbstractModel {

    /**
    * 体检报告信息
    */
    @SerializedName("PhysicalExaminationMulti")
    @Expose
    private PhysicalExamination PhysicalExaminationMulti;

    /**
    * 版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get 体检报告信息 
     * @return PhysicalExaminationMulti 体检报告信息
     */
    public PhysicalExamination getPhysicalExaminationMulti() {
        return this.PhysicalExaminationMulti;
    }

    /**
     * Set 体检报告信息
     * @param PhysicalExaminationMulti 体检报告信息
     */
    public void setPhysicalExaminationMulti(PhysicalExamination PhysicalExaminationMulti) {
        this.PhysicalExaminationMulti = PhysicalExaminationMulti;
    }

    /**
     * Get 版本 
     * @return Version 版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
     * @param Version 版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public PhysicalExaminationV1() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhysicalExaminationV1(PhysicalExaminationV1 source) {
        if (source.PhysicalExaminationMulti != null) {
            this.PhysicalExaminationMulti = new PhysicalExamination(source.PhysicalExaminationMulti);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PhysicalExaminationMulti.", this.PhysicalExaminationMulti);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

