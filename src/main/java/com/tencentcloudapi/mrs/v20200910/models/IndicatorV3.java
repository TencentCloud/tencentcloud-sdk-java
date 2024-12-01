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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndicatorV3 extends AbstractModel {

    /**
    * 检验报告V3结论
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableIndictors")
    @Expose
    private TableIndicators [] TableIndictors;

    /**
    * 版本号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 检验报告V3结论
    */
    @SerializedName("TableIndicators")
    @Expose
    private TableIndicators [] TableIndicators;

    /**
    * 数据在原PDF文件中的第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 检验报告V3结论
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableIndictors 检验报告V3结论
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public TableIndicators [] getTableIndictors() {
        return this.TableIndictors;
    }

    /**
     * Set 检验报告V3结论
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableIndictors 检验报告V3结论
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setTableIndictors(TableIndicators [] TableIndictors) {
        this.TableIndictors = TableIndictors;
    }

    /**
     * Get 版本号 
     * @return Version 版本号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号
     * @param Version 版本号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 检验报告V3结论 
     * @return TableIndicators 检验报告V3结论
     */
    public TableIndicators [] getTableIndicators() {
        return this.TableIndicators;
    }

    /**
     * Set 检验报告V3结论
     * @param TableIndicators 检验报告V3结论
     */
    public void setTableIndicators(TableIndicators [] TableIndicators) {
        this.TableIndicators = TableIndicators;
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

    public IndicatorV3() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndicatorV3(IndicatorV3 source) {
        if (source.TableIndictors != null) {
            this.TableIndictors = new TableIndicators[source.TableIndictors.length];
            for (int i = 0; i < source.TableIndictors.length; i++) {
                this.TableIndictors[i] = new TableIndicators(source.TableIndictors[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.TableIndicators != null) {
            this.TableIndicators = new TableIndicators[source.TableIndicators.length];
            for (int i = 0; i < source.TableIndicators.length; i++) {
                this.TableIndicators[i] = new TableIndicators(source.TableIndicators[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TableIndictors.", this.TableIndictors);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "TableIndicators.", this.TableIndicators);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

