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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetTypeTopResponse extends AbstractModel {

    /**
    * 账号Top5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private AssetKeyVal [] User;

    /**
    * 端口Top5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private AssetKeyVal [] Port;

    /**
    * 进程Top5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Process")
    @Expose
    private AssetKeyVal [] Process;

    /**
    * 软件Top5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Software")
    @Expose
    private AssetKeyVal [] Software;

    /**
    * 数据库Top5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Database")
    @Expose
    private AssetKeyVal [] Database;

    /**
    * Web应用Top5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebApp")
    @Expose
    private AssetKeyVal [] WebApp;

    /**
    * Web站点Top5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebLocation")
    @Expose
    private AssetKeyVal [] WebLocation;

    /**
    * Web框架Top5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebFrame")
    @Expose
    private AssetKeyVal [] WebFrame;

    /**
    * Web服务Top5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebService")
    @Expose
    private AssetKeyVal [] WebService;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 账号Top5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 账号Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetKeyVal [] getUser() {
        return this.User;
    }

    /**
     * Set 账号Top5
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 账号Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(AssetKeyVal [] User) {
        this.User = User;
    }

    /**
     * Get 端口Top5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetKeyVal [] getPort() {
        return this.Port;
    }

    /**
     * Set 端口Top5
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(AssetKeyVal [] Port) {
        this.Port = Port;
    }

    /**
     * Get 进程Top5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Process 进程Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetKeyVal [] getProcess() {
        return this.Process;
    }

    /**
     * Set 进程Top5
注意：此字段可能返回 null，表示取不到有效值。
     * @param Process 进程Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcess(AssetKeyVal [] Process) {
        this.Process = Process;
    }

    /**
     * Get 软件Top5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Software 软件Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetKeyVal [] getSoftware() {
        return this.Software;
    }

    /**
     * Set 软件Top5
注意：此字段可能返回 null，表示取不到有效值。
     * @param Software 软件Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoftware(AssetKeyVal [] Software) {
        this.Software = Software;
    }

    /**
     * Get 数据库Top5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Database 数据库Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetKeyVal [] getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库Top5
注意：此字段可能返回 null，表示取不到有效值。
     * @param Database 数据库Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabase(AssetKeyVal [] Database) {
        this.Database = Database;
    }

    /**
     * Get Web应用Top5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebApp Web应用Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetKeyVal [] getWebApp() {
        return this.WebApp;
    }

    /**
     * Set Web应用Top5
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebApp Web应用Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebApp(AssetKeyVal [] WebApp) {
        this.WebApp = WebApp;
    }

    /**
     * Get Web站点Top5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebLocation Web站点Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetKeyVal [] getWebLocation() {
        return this.WebLocation;
    }

    /**
     * Set Web站点Top5
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebLocation Web站点Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebLocation(AssetKeyVal [] WebLocation) {
        this.WebLocation = WebLocation;
    }

    /**
     * Get Web框架Top5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebFrame Web框架Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetKeyVal [] getWebFrame() {
        return this.WebFrame;
    }

    /**
     * Set Web框架Top5
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebFrame Web框架Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebFrame(AssetKeyVal [] WebFrame) {
        this.WebFrame = WebFrame;
    }

    /**
     * Get Web服务Top5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebService Web服务Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetKeyVal [] getWebService() {
        return this.WebService;
    }

    /**
     * Set Web服务Top5
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebService Web服务Top5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebService(AssetKeyVal [] WebService) {
        this.WebService = WebService;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAssetTypeTopResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetTypeTopResponse(DescribeAssetTypeTopResponse source) {
        if (source.User != null) {
            this.User = new AssetKeyVal[source.User.length];
            for (int i = 0; i < source.User.length; i++) {
                this.User[i] = new AssetKeyVal(source.User[i]);
            }
        }
        if (source.Port != null) {
            this.Port = new AssetKeyVal[source.Port.length];
            for (int i = 0; i < source.Port.length; i++) {
                this.Port[i] = new AssetKeyVal(source.Port[i]);
            }
        }
        if (source.Process != null) {
            this.Process = new AssetKeyVal[source.Process.length];
            for (int i = 0; i < source.Process.length; i++) {
                this.Process[i] = new AssetKeyVal(source.Process[i]);
            }
        }
        if (source.Software != null) {
            this.Software = new AssetKeyVal[source.Software.length];
            for (int i = 0; i < source.Software.length; i++) {
                this.Software[i] = new AssetKeyVal(source.Software[i]);
            }
        }
        if (source.Database != null) {
            this.Database = new AssetKeyVal[source.Database.length];
            for (int i = 0; i < source.Database.length; i++) {
                this.Database[i] = new AssetKeyVal(source.Database[i]);
            }
        }
        if (source.WebApp != null) {
            this.WebApp = new AssetKeyVal[source.WebApp.length];
            for (int i = 0; i < source.WebApp.length; i++) {
                this.WebApp[i] = new AssetKeyVal(source.WebApp[i]);
            }
        }
        if (source.WebLocation != null) {
            this.WebLocation = new AssetKeyVal[source.WebLocation.length];
            for (int i = 0; i < source.WebLocation.length; i++) {
                this.WebLocation[i] = new AssetKeyVal(source.WebLocation[i]);
            }
        }
        if (source.WebFrame != null) {
            this.WebFrame = new AssetKeyVal[source.WebFrame.length];
            for (int i = 0; i < source.WebFrame.length; i++) {
                this.WebFrame[i] = new AssetKeyVal(source.WebFrame[i]);
            }
        }
        if (source.WebService != null) {
            this.WebService = new AssetKeyVal[source.WebService.length];
            for (int i = 0; i < source.WebService.length; i++) {
                this.WebService[i] = new AssetKeyVal(source.WebService[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "User.", this.User);
        this.setParamArrayObj(map, prefix + "Port.", this.Port);
        this.setParamArrayObj(map, prefix + "Process.", this.Process);
        this.setParamArrayObj(map, prefix + "Software.", this.Software);
        this.setParamArrayObj(map, prefix + "Database.", this.Database);
        this.setParamArrayObj(map, prefix + "WebApp.", this.WebApp);
        this.setParamArrayObj(map, prefix + "WebLocation.", this.WebLocation);
        this.setParamArrayObj(map, prefix + "WebFrame.", this.WebFrame);
        this.setParamArrayObj(map, prefix + "WebService.", this.WebService);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

