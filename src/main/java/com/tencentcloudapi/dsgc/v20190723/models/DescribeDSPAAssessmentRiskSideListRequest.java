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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPAAssessmentRiskSideListRequest extends AbstractModel {

    /**
    * <p>DSPA实例ID</p>
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * <p>评估模板id</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
     * Get <p>DSPA实例ID</p> 
     * @return DspaId <p>DSPA实例ID</p>
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set <p>DSPA实例ID</p>
     * @param DspaId <p>DSPA实例ID</p>
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get <p>评估模板id</p> 
     * @return TemplateId <p>评估模板id</p>
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>评估模板id</p>
     * @param TemplateId <p>评估模板id</p>
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    public DescribeDSPAAssessmentRiskSideListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAAssessmentRiskSideListRequest(DescribeDSPAAssessmentRiskSideListRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

