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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DefaultKongRoute extends AbstractModel {

    /**
    * <p>服务名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>服务ID</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>HTTP Method</p>
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * <p>Http Path</p>
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
     * Get <p>服务名字</p> 
     * @return Name <p>服务名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>服务名字</p>
     * @param Name <p>服务名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>服务ID</p> 
     * @return ID <p>服务ID</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>服务ID</p>
     * @param ID <p>服务ID</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>HTTP Method</p> 
     * @return Methods <p>HTTP Method</p>
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set <p>HTTP Method</p>
     * @param Methods <p>HTTP Method</p>
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get <p>Http Path</p> 
     * @return Paths <p>Http Path</p>
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set <p>Http Path</p>
     * @param Paths <p>Http Path</p>
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    public DefaultKongRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DefaultKongRoute(DefaultKongRoute source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Methods != null) {
            this.Methods = new String[source.Methods.length];
            for (int i = 0; i < source.Methods.length; i++) {
                this.Methods[i] = new String(source.Methods[i]);
            }
        }
        if (source.Paths != null) {
            this.Paths = new String[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new String(source.Paths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);

    }
}

