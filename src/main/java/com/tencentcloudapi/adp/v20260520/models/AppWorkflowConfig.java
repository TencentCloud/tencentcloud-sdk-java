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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppWorkflowConfig extends AbstractModel {

    /**
    * 是否使用PDL
    */
    @SerializedName("EnablePDL")
    @Expose
    private Boolean EnablePDL;

    /**
     * Get 是否使用PDL 
     * @return EnablePDL 是否使用PDL
     */
    public Boolean getEnablePDL() {
        return this.EnablePDL;
    }

    /**
     * Set 是否使用PDL
     * @param EnablePDL 是否使用PDL
     */
    public void setEnablePDL(Boolean EnablePDL) {
        this.EnablePDL = EnablePDL;
    }

    public AppWorkflowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppWorkflowConfig(AppWorkflowConfig source) {
        if (source.EnablePDL != null) {
            this.EnablePDL = new Boolean(source.EnablePDL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnablePDL", this.EnablePDL);

    }
}

